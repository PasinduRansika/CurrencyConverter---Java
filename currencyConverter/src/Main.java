import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lktous =300;
        int total;
        System.out.println("          -- Currency Converter --");
        System.out.println(" ");
        System.out.print("Chose Your Currency : ( US - 1 | LKR - 2 ) -- ");
        int mainCur = input.nextInt();
        System.out.print("Enter The Amount ( $ | LKR ) -  ");

        int amount = input.nextInt();
        System.out.print("To What Currency : ( US - 1 | LKR - 2 ) -- " );
        int secCur = input.nextInt();

        if (mainCur == 1 && secCur == 2){
            total = lktous * amount;
            System.out.println("\n               You Have LKR "+total);
        }
        else if (mainCur == 2 && secCur == 1){
            total = amount / lktous ;
            System.out.println("You Have - $ "+total);
        }
        else{
            System.out.println("\n           ** ERROR !  TRY AGAIN **");
        }

        System.out.println("\n              -- Thank You ! -- ");
        System.out.println("\n         -- MADE BY PASINDU RANSIKA -- ");
        input.close();

        }
    }