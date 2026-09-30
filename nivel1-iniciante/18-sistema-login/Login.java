/*
Regra de Negócio — Sistema de Login

O programa deve simular um sistema de autenticação simples, usando métodos pra organizar a lógica.
Fluxo esperado:

O sistema tem um usuário e senha fixos, cadastrados no código (ex: usuário "admin", senha "1234")
O programa pede que o usuário digite login e senha
Compara com os dados corretos
Se baterem os dois, mostra "Login realizado com sucesso!"
Se errar, mostra "Usuário ou senha incorretos!" e permite até 3 tentativas
Se errar as 3 tentativas, bloqueia o acesso com uma mensagem de bloqueio
*/
package metodos;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String usuario = "admin";
        String senha = "123456";
        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE LOGIN");
        int contador = 1;
        do{

                System.out.println("Digite o usuario: ");
                String usuarioDig = scanner.next();
                System.out.println("Digite o password: ");
                String passwordDig = scanner.next();
                boolean resultado = LoginMetodos.LoginMetodo(usuarioDig, passwordDig, usuario, senha);
                if (resultado){
                    System.out.println("Login realizado com sucesso");
                    break;
                }else {
                    System.out.println("Usuario ou senha incorreto! Em 3 tentativas o sistema ira bloquear o acesso!" + " 3/"+ contador );
                    contador++;
                }


        }while (contador <= 3);

        if (contador >= 3) {
            System.out.println("Sistema bloqueado!! Volte mais tarde.");
        }

    }
}
