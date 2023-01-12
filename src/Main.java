import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Ho creato una variabile di tipo int chiamata number.
         */
        int number;

        /**
         * Ho interagito con l'user scrivendo un Welcome.
         */
        System.out.println("Welcome!");

        /**
         * Ho chiesto al user di indovinare il numero.
         */
        System.out.println("Guess the number");

        /**
         * Ho creato la variabil int e l'ho messa uguale a 0, ed ho cominciato a costruire il mio while.
         * Ho settato che i fosse piu grande di 0, cosi da creare un loop infinito.
         */
        int i = 1;
        while(i > 0){

            /**
             * Ho creato poi un numero random tra 1 e 10 e l'ho attribuito a number.
             */
            Random random = new Random();
            int min = 1;
            int max = 10;
            int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
            number = random_int;

            /**
             * Ho poi creato uno scanner per permettere all'user di inserire i numeri da indovinare.
             */
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            /**
             * Ho creato un if per inserire la condizione che nel caso in cui l'user indovinasse il numero, che gli
             * sciva Congratulations e che il programma si fermi.
             */
            if(i == number){
                System.out.println("Congratulations");
                break;
            }

            /**
             * Infine ho aggiunto i++ per far andare avanti il programma di un numero.
             */
            i++;
        }
    }
}