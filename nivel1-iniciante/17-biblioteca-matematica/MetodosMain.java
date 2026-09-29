package metodosMain;

public class MetodosMain {
    public static double potencia(double a, double b){
        return  Math.pow(a, b); // 8.0;
    }
    public static double raiz(double a){
        if(a<0){

            System.out.println("Raiz negativo");
            return 0;
        }else {
            return Math.sqrt(a);
        }
    }
    public static boolean ehPar(double a){
        return a % 2 == 0;
    }
    public static double maiorEntreDois(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }
}
