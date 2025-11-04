package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT-500";
        carro2.ano = 2015;

        System.out.println("------------------\nCarro 01\n---------------\nNome: "
                + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);

        System.out.println("------------------\nCarro 02\n---------------\nNome: "
                + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);
    }
}
