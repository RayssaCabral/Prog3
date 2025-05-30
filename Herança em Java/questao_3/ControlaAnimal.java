public class ControlaAnimal {

public static void main(String[] args) {
     
     Cachorro cachorro = new Cachorro("Bidu", 5);
     Gato gato = new Gato("Jade", 3);

     
     System.out.println("Nome: " + cachorro.nome + " | Idade: " + cachorro.idade + " anos");
     cachorro.emitirSom();

     System.out.println("\nNome: " + gato.nome + " | Idade: " + gato.idade + " anos");
     gato.emitirSom(); 
 }
}
