/*// Given a string s consisting of small English letters, find and return the first instance of a non-repeating character in it. If there is no such character, return '_'.
//
// Example
//
// For s = "abacabad", the output should be
// solution(s) = 'c'.
//
// There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.
//
// For s = "abacabaabacaba", the output should be
// solution(s) = '_'.
//
// There are no characters in this string that do not repeat.
nao pode usar ia, e nem pesquisar direto como monta essa resolução
*/
public class TesteLogica {
    public static void main(String[] args) {
        String s = "abacabad";
        boolean achou = false;
        for (int i = 0; i <= s.length() - 1; i++) {
            int contador = 0;
            for (int j = 0; j <= s.length() - 1; j++) {
               if (s.charAt(i) == s.charAt(j)) {
                   contador++;
               }
            }
            if (contador <= 1) {
                System.out.println(s.charAt(i));
                achou = true;
                break;
            }
        }
        if (!achou) {
            System.out.println("_");
        }



    }
}
