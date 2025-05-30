static class Cachorro {
     String nome;
     int idade;

     Cachorro(String nome, int idade) {
         this.nome = nome;
         this.idade = idade;
     }

     void emitirSom() {
         System.out.println("Latindo...");
     }
 }