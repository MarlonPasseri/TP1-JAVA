// Main.java (no pacote main)
package Main;

import pacote1.ClassePacote1;
import pacote2.ClassePacote2;
import pacote3.ClassePacote3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exemplo de um projeto Java com pacotes.");

        // Criando objetos das classes de diferentes pacotes
        ClassePacote1 objeto1 = new ClassePacote1();
        ClassePacote2 objeto2 = new ClassePacote2();
        ClassePacote3 objeto3 = new ClassePacote3();

        // Chamando métodos das classes de diferentes pacotes
        objeto1.metodoPacote1();
        objeto2.metodoPacote2();
        objeto3.metodoPacote3();
    }
}
