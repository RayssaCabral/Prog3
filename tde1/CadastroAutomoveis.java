import java.io.*;
import java.util.*;

public class CadastroAutomoveis {
    private ArrayList<Automovel> lista = new ArrayList<>();
    private final String arquivo = "automoveis.txt";

    public CadastroAutomoveis() {
        carregarArquivo();
    }

    public void inserirAutomovel(Automovel a) {
        if (buscarPorPlaca(a.getPlaca()) == null) {
            lista.add(a);
            System.out.println("Automóvel incluído com sucesso.");
        } else {
            System.out.println("Placa já cadastrada.");
        }
    }

    public void removerAutomovel(String placa) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            lista.remove(a);
            System.out.println("Automóvel removido.");
        } else {
            System.out.println("Placa não encontrada.");
        }
    }

    public void alterarAutomovel(String placa, Automovel novosDados) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            a.setModelo(novosDados.getModelo());
            a.setMarca(novosDados.getMarca());
            a.setAno(novosDados.getAno());
            a.setValor(novosDados.getValor());
            System.out.println("Dados alterados com sucesso.");
        } else {
            System.out.println("Automóvel não encontrado.");
        }
    }

    public Automovel buscarPorPlaca(String placa) {
        for (Automovel a : lista) {
            if (a.getPlaca().equalsIgnoreCase(placa)) {
                return a;
            }
        }
        return null;
    }

    public void listarOrdenado(String criterio) {
        Comparator<Automovel> comparator;

        switch (criterio.toLowerCase()) {
            case "placa":
                comparator = Comparator.comparing(Automovel::getPlaca);
                break;
            case "modelo":
                comparator = Comparator.comparing(Automovel::getModelo);
                break;
            case "marca":
                comparator = Comparator.comparing(Automovel::getMarca);
                break;
            default:
                System.out.println("Critério inválido.");
                return;
        }

        lista.stream()
                .sorted(comparator)
                .forEach(a -> System.out.println(a.exibir()));
    }

    public void salvarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Automovel a : lista) {
                bw.write(a.toString());
                bw.newLine();
            }
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }
    }

    private void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 5) {
                    String placa = dados[0];
                    String modelo = dados[1];
                    String marca = dados[2];
                    int ano = Integer.parseInt(dados[3]);
                    double valor = Double.parseDouble(dados[4]);
                    lista.add(new Automovel(placa, modelo, marca, ano, valor));
                }
            }
        } catch (FileNotFoundException e) {
            // Primeira execução, sem arquivo ainda.
        } catch (IOException e) {
            System.out.println("Erro ao carregar: " + e.getMessage());
        }
    }
}
