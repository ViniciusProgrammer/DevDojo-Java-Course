package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
                  // Variável de referência(estudante01) do tipo Estudante
        Estudante estudante01 = new Estudante();
        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        System.out.print("Nome: " + estudante01.nome + "\n" + "Idade: " + estudante01.idade + "\n" + "Sexo: " + estudante01.sexo);
    }
}
