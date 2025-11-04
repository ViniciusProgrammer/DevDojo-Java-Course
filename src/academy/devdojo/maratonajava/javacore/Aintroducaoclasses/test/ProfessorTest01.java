package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.nome = "Mestre Kami";
        professor1.idade = 45;
        professor1.sexo = 'M';

        System.out.println("Nome: " + professor1.nome + " Idade: " + professor1.idade + " Sexo: " + professor1.sexo);
    }
}
