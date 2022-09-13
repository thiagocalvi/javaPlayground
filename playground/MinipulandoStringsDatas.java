package playground;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.lang.model.util.ElementScanner6;

public class MinipulandoStringsDatas {
    public static void main(String[] args){
        String nome = "thiago";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String outroNome = "Thiago";

        System.out.println(nome.equals(outroNome));
        System.out.println(nome.equalsIgnoreCase(outroNome));

        Locale brasil = new Locale("pt", "BR");
        LocalDate hoje = LocalDate.now();
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "Bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "Boa tarde";
        }
        else { 
            saudacao = "Boa noite";
        }

        System.out.println("Olá " + nome + " Hoje é " + diaSemana + ", " + saudacao);
        System.out.printf("Olá, %s hoje é %s, %s", nome, diaSemana, saudacao.toUpperCase());

    }
}
