package playground;

public class Funcoes {
    
    public static void main(String[] args){
        
        saudacao("Thiago");
        int resultado = soma(2, 3);
        System.out.println(resultado);
     
    }

    public static void saudacao(String name){
        System.out.println("Hello " + name + "!!");
    }

    public static int soma(int a, int b){
        return a + b;
    }
}
