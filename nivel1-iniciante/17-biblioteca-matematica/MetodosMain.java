package metodosMain;

public class MetodosMain {
    public static double potencia(double a, double b){
        double resultado = 0;
        return resultado = Math.pow(a, b); // 8.0;
    }
    public static double raiz(double a){
        if(a<0){
            System.out.println("Raiz negativo");
        }else {
            return Math.sqrt(a);
        }
    }
    public static int ehPar(int a){
        boolean numeroUser = true;
        return (a % 2 == 0) ? numeroUser = true : numeroUser = false;
        System.out.println("Numero escolhido é : "+numeroUser);

    }
    public static double maiorEntreDois(double a, double b){
        if(a<b){
            return a;
        }else if(a>b){
            return b;
        }
    }
}
