package playground;

import java.util.Arrays;

public class Vetores {
    
    public static void main(String[] args){
        int[] names = new int[5];
        
        for (int i = 0; i < names.length; i++){
            names[i] = i;
            System.out.println(names[i]);
        }

        String[] letras = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(letras));

        int[] numeros = {12, 34,56, 57, 90};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }

            media += numeros[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/numeros.length );


    }

}
