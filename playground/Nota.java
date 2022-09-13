package playground;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int mediaA = 80;
        int mediaB = 70;
        int mediaC = 60;

        String situacao = "APROVADO";
        String graduacao;

        System.out.println("Informe o nome do aluno");
        String nome = sc.nextLine();
        System.out.println("Informe a nota do aluno");
        int nota = sc.nextInt();

        if (nota >= mediaA){
            graduacao = "A";
        }
        else if (nota < mediaA && nota >= mediaB){
            graduacao = "B";
        }
        else if (nota < mediaB && nota >= mediaC){
            graduacao = "C";
        }
        else if (nota < mediaC && nota > 0){
            graduacao = "D";
            situacao = "REPROVADO";
        }
        else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
            case "C":
                System.out.println("ALUNO: " + nome + " - SITUAÇÃO: " + situacao + " - GRADUAÇÃO: " + graduacao);
                break;
            case "D":
                System.out.println("ALUNO: " + nome + " - SITUAÇÃO: " + situacao);
                break;
            default:
                System.out.println("GRADUAÇÃO INVALIDA");
                break;
        }

    }
}
