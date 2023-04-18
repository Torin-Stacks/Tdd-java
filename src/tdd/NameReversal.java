package tdd;

import java.util.Scanner;

public class NameReversal {

    public static void main(String[] args) {
        reverse();
    }
    public  static void reverse(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        int index = name.length() - 1;
        while (index >= 0){
            System.out.print(name.charAt(index));
            index--;
        }

    }
}
