public class CharacterPattern_25 {
    public static void main(String args[]) {
        int n = 4;
        char c = 'A';
        for (int line = 0; line < n; line++) {
            for (int i = 0; i <= line; i++) {

                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
