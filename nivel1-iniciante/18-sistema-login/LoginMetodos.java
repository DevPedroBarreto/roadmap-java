package metodos;

public class LoginMetodos {
    public static boolean LoginMetodo(String usuario, String senha, String usuarioDig, String senhaDig){
        if (usuarioDig.equals(usuario) && senha.equals(senhaDig)) {
            return true;

        }else {
            return false;
        }
    }
}
