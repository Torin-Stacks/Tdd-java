package tdd;

import java.util.Scanner;



public class EncryptionDecryption {

    public static void main(String[] args) {
        System.out.println("press 1 for Encryption");
        System.out.println("press 2 for Decryption");
        System.out.println("press 3 to exit");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        change(number);

    }

    public static int change(int number){
        switch(number){
            case 1: encryption();
            break;
            case 2: decryption();
            break;
            case 3: toExit();
            break;

        }
        return number;
    }

    public static void encryption(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit integer: ");
        String fourDigit = input.nextLine();
        while(fourDigit.length() != 4 || !fourDigit.matches("^[0-9]+$")) {
            System.out.println("Please input a four digit integer");
            fourDigit = input.nextLine();
        }

        int fourDigitInteger = Integer.parseInt(fourDigit);

        int fourthDigit = fourDigitInteger % 10;
        int threeDigitInteger = fourDigitInteger / 10;
        int thirdDigit = threeDigitInteger % 10;
        int twoDigitInteger = threeDigitInteger / 10;
        int secondDigit = twoDigitInteger % 10;
        int firstDigit = twoDigitInteger / 10;

        System.out.printf("%d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);

        int firstDigitPlus7 = firstDigit + 7;
        int secondDigitPlus7 = secondDigit + 7;
        int thirdDigitPlus7 = thirdDigit + 7;
        int fourthDigitPlus7 = fourthDigit + 7;

        System.out.printf("%d%d%d%d%n", firstDigitPlus7, secondDigitPlus7, thirdDigitPlus7, fourthDigitPlus7);

        int newFirstDigit = firstDigitPlus7 % 10;
        int newSecondDigit = secondDigitPlus7 % 10;
        int newThirdDigit = thirdDigitPlus7 % 10;
        int newFourthDigit = fourthDigitPlus7 % 10;


        int dividedFirstDigit = firstDigitPlus7 / 10;
        int dividedSecondDigit = secondDigitPlus7 / 10;
        int dividedThirdDigit = thirdDigitPlus7 / 10;
        int dividedFourthDigit = fourthDigitPlus7 / 10;


        System.out.printf("%d%d%d%d%n", newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit);

        int temp;

        temp = newFirstDigit;
        newFirstDigit = newSecondDigit;
        newSecondDigit = newThirdDigit;
        newThirdDigit = newFourthDigit;
        newFourthDigit = temp;
        temp = newFirstDigit;
        newFirstDigit = newSecondDigit;
        newSecondDigit = newThirdDigit;
        newThirdDigit = newFourthDigit;
        newFourthDigit = temp;

        System.out.printf("%d%d%d%d%n", newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit);

    }

    public  static void decryption(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit integer: ");
        String fourDigit = input.nextLine();
        while(fourDigit.length() != 4 || !fourDigit.matches("^[0-9]+$")) {
            System.out.println("Please input a four digit integer");
            fourDigit = input.nextLine();
        }

        int fourDigitInteger = Integer.parseInt(fourDigit);


        int fourthDigit = fourDigitInteger % 10;
        int threeDigitInteger = fourDigitInteger / 10;
        int thirdDigit = threeDigitInteger % 10;
        int twoDigitInteger = threeDigitInteger / 10;
        int secondDigit = twoDigitInteger % 10;
        int firstDigit = twoDigitInteger / 10;

        System.out.printf("%d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);

        int temp;

        temp = firstDigit;
        firstDigit = secondDigit;
        secondDigit = thirdDigit;
        thirdDigit = fourthDigit;
        fourthDigit = temp;
        temp = firstDigit;
        firstDigit = secondDigit;
        secondDigit = thirdDigit;
        thirdDigit = fourthDigit;
        fourthDigit = temp;

        System.out.printf("%d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);

        firstDigit = ((10 + firstDigit) - 7) % 10;
        secondDigit = ((10 + secondDigit) - 7) % 10;
        thirdDigit = ((10 + thirdDigit) - 7) % 10;
        fourthDigit = ((10 + fourthDigit) - 7) % 10;

        System.out.printf("%d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);


    }

    public static void toExit(){
        System.exit(1);
    }
}
