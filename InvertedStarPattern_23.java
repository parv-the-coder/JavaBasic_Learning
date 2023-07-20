public class InvertedStarPattern_23 {
    public static void main(String args[]) {

        for (int line = 7; line >= 0; line--) {

            for (int i = line; i >= 0; i--) {

                System.out.print('*');

            }
            System.out.println();

        }
    }

}