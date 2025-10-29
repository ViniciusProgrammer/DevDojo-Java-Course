package academy.davdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        if (isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        int dinheiroNaConta = 1000000;

        if (dinheiroNaConta > 500000) {
            System.out.println("Tenho dinheiro para comprar uma BMW");
        } else if (dinheiroNaConta > 200000) {
            System.out.println("Não possuo dinheiro suficiente para comprar uma BMW, mas dar par comprar um GOL");
        } else {
            System.out.println("Comprarei um UNO");
        }
    }
}
