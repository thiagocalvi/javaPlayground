public class Main {

    public static void main(String[] args){
        System.out.println("Hello World!!");
        String name = "Thiago";
        System.out.println("Bem vindo, " + name);

        // int a;
        // int b = 2;
        // a = 3;
        // int soma = a + b;
        // int sub = a - b;
        // int mult = a * b;
        // float div = (float) a / b;
        // System.out.println(soma);
        // System.out.println(sub);
        // System.out.println(mult);
        // System.out.println(div);


        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        //Tabela verdade (AND)
        //Operador &&
        //true se todas a opções forem verdadeiras
        //true && true = true
        //true && false = false
        //false && false = false


        //Operador || (OR)
        //true se pelomenos uma das condições for verdadeira
        //true || true = true
        //false || true = true
        //false || false = false
        System.out.println(vamosAPraia);
        String mensage = fimDeSemana ? "É fim de semana": "Não é fim de semana";
        System.out.println(mensage);



        //estruturas condicionais

        

        

    }
}