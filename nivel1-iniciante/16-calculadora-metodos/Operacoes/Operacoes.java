package metodos.Operacoes;

public class Operacoes {
    public static float somar(float a, float b) {
            return a + b;
    }
    public static float subtrair(float a, float b) {
            return a - b;
    }
    public static float multiplicar(float a, float b) {
            return a * b;
    }
    public static float dividir(float a, float b)  {

            if (b == 0){

                System.out.println("Danadinho, não pode dividir por 0");
                return 0;

            }
            else {
                return a / b;
            }
    }
}
