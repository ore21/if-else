import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        int guess = 0;
        int answer = 104;
        Scanner scanner = new Scanner(System.in);

        while(guess != answer){

            System.out.println("Enter a number between 92.0 and 104.0: ");

            guess = scanner.nextInt();

            int value = Math.abs(guess - answer);


            if (value < 97.5) {
                System.out.println(" Low " );
            //}
            if ((value == 99.5) ||  (value > 97.5)) {
                System.out.println(" Normal " );
            //}
            if (value == 104.0) {
                System.out.println(" High " );
            }
        }
        System.out.println(" The weather that you entered is: " + (int) guess);
    }
}}}