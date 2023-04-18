package tdd;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeLoop {

    public static void main(String[] args) {

//        int counter = 1;
//        String star = "*";
//        System.out.println(star);
//        while (counter < 5) {
//            star = star + "*";
//            System.out.println(star);
//            counter++;
//        }

//        int counter1 = 1;
//        while(counter1 <= 4){
//            int counter2 = 1;
//            while (counter2 <= 1){
//                if(counter1 == 1) {System.out.println("****");}
//                if(counter1 == 4) {System.out.println("****");}
//                else
//                System.out.print("*  *");
//                counter2++;
//            }
//            System.out.println();
//            counter1++;
//        }


//        for (int i = 1; i<=5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
        //       }

//        int count = 1;
//        while (count <= 100) {
//             if(count % 3 == 0 && count % 5 == 0){
//                System.out.println("fizzbuzz");
//            }
//            else if (count % 3 == 0) {
//                System.out.println("fizz");
//
//            }else if (count % 5 == 0) {
//                System.out.println("buzz");
//            }
//            else{
//                System.out.println(count);
//            }
//            count++;
//        }


//        for(int i = 1; i <= 10; i++){
//            for (int j = 10; j >= i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        for(int i = 1; i <= 10; i++){
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");}
//
//                for (int k = 10; k >= i; k--) {
//                  System.out.print("*");
//              }
//
//            System.out.println();
//        }


//        for(int i = 1; i <= 10; i++){
//            for (int j = 10; j >= i; j--){
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= i; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for(int i = 1; i<=5; i++){
//            for(int j = 1; j<= i; j++){
//                System.out.print(j + "  ");
//            }
//            System.out.println();
//        }
//
//        for(int i = 1; i <= 5; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print(" ");
//            }
//           for (int k = 1; k <= i; k++){
//              System.out.print(" *");
//            }
//            System.out.println();
//        }


//        int a = 3;
//        int b = 5;
//        int c;
//
//        c = a;
//        a = b;
//        b = c;
//
//        System.out.println(a);
//        System.out.println(b);


        //fibonacci sequence

//        int count = 0;
//        int a = 0;
//        int b = 1;
//        int c;
//
//        while (count <= 10){
//             c = a + b;
//            System.out.println(c);
//            a = b;
//            b = c;
//             count++;
//        }


//        int i = 0;
//        while(i <= 10){
//            if(i == 3){
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }


//        for(int i = 0; i <= 10; i++){
//            if(i == 3){
//            continue;}
//            System.out.println(i);
//        }

//        int firstNumber = (int)(Math.random() * 10);
//        int secondNumber = (int)(Math.random() * 10);
//        int total = firstNumber + secondNumber;
//
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("what is the sum of " + firstNumber + " and " + secondNumber + " ?");
//
//        int answer = input.nextInt();
//
//        while(total != answer){
//            System.out.println( firstNumber + " + " + secondNumber + " is not equal to " + answer + " please try again ");
//            answer = input.nextInt();
//        }
//        System.out.println("you're correct!!");


//        int randomNumber = (int)(Math.random() * 101);
//
//        System.out.println("Please enter a number between one and 100");
//
//        Scanner input =  new Scanner(System.in);
//        int number = input.nextInt();
//
//        while(randomNumber != number){
//
//            if(number > randomNumber){
//                System.out.println("hint: your guess is too high ");
//            }
//
//            else if (number < randomNumber){
//                System.out.println("hint: your guess is too low ");
//            }
//
//            number = input.nextInt();
//
//        }

        //       System.out.println("you are correct!");


//        int i = 1;
//        while (i < 10) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//
//        }


//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(i * j);
//            }
//            System.out.println();
//        }

//        int i = 0;
//        while(i < 10){
//            int j = 0;
//            while(j < i){
//                System.out.print(i * j);
//                j++;
//            }
//            i++;
//            System.out.println( );
//        }


//        int i = 0;
//        while (i < 5) {
//            for (int j = i; j > 1; j--){
//                System.out.print(j + " ");}
//            System.out.println("****");
//            i++;
//        }


//        int i = 1;
//        do {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "G");
//                num += 2;
//            }
//            System.out.println();
//            i++;
//        } while (i <= 5);

        //switch statement
//        String condition = "rainy day";
//        switch(condition){
//
//            case "sunny day":
//                System.out.println("Take out your sunshades");
//                break;
//
//            case "windy day":
//                System.out.println("Take out your jacket");
//                break;
//
//            case "rainy day":
//                System.out.println("Take out your umbrella");
//                break;
//
//            case "snowy day":
//                System.out.println("Stay at home");
//                break;


        //     }


//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter a number: ");
//        int firstValue = input.nextInt();
//
//        int sum = 0;
//
//        while (firstValue >= sum  ){
//
//            System.out.println("Enter an integer: ");
//           int number = input.nextInt();
//            sum = sum + number;
//
//            System.out.println(sum);
//
//
//
//
//        }


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int firstValue = input.nextInt();
//        int sum = 0;
//
//        while(sum <= firstValue){
//            System.out.println("Enter an integer: ");
//           int number = input.nextInt();
//            sum = sum + number;
//            System.out.println(sum);
//
//        }


//        Scanner input = new Scanner(System.in);
//
//        int counter = 1;
//        int sum = 0;
//
//        while(counter <= 5) {
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            sum = sum + score;
//            System.out.println(sum);
//            counter++;
//        }


//        Scanner input = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//
//        while (counter <= 5) {
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            if (score >= 0 && score <= 100) {
//                sum = sum + score;
//                System.out.println(sum);
//
//            }
//
//            counter++;
//        }



// NO 3
//        Scanner input = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//        int average;
//
//        while (counter <= 5) {
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            if (score >= 0 && score <= 100) {
//                sum = sum + score;
//                average = sum / counter;
//                System.out.println(sum);
//                System.out.println(average);
//                counter++;
//            }
//
//
//        }

        //NO 4

//        Scanner input = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//
//
//        while (counter <= 5) {
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            if(score >= 0 && score <= 100) {
//                sum = sum + score;
//                System.out.println(sum);
//                counter++;
//            }
//
//        }

       // NO 5

//        Scanner input = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//
//        while(counter <= 5){
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            if(score >= 0 && score <= 100)
//            {
//                if (counter % 2 == 0){
//                    sum = sum + score;
//                }
//                counter++;
//                System.out.println(sum);
//
//                }
//        }
//

 //       NO 6

//      Scanner input = new Scanner(System.in);
//      int counter = 1;
//        int sum = 0;
//
//        while(counter <= 10){
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            if(score >= 0 && score <= 100)
//            {
//                if (counter % 2 == 0){
//                    sum = sum + score;
//                }
//                counter++;
//                System.out.println(sum);
//
//                }
//        }


  //      NO 7

//        Scanner input = new Scanner(System.in);
//        int counter = 1;
//        int sum = 0;
//
//        while(counter <= 100){
//            System.out.println("Enter a score: ");
//            int score = input.nextInt();
//            if(score >= 0 && score <= 100)
//            {
//                if (score % 2 == 0){
//                    sum = sum + score;
//                }
//                counter++;
//                System.out.println(sum);
//
//            }
//        }


//        System.out.println("Press 1 for English");
//        System.out.println("Press 2 for Yoruba");
//        System.out.println("Press 3 for Igbo");
//        System.out.println("Press 4 for Hausa");
//
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        switch (number){
//            case 1 :
//                System.out.println("English");
//                break;
//            case 2 :
//                System.out.println("Yoruba");
//                break;
//            case 3 :
//                System.out.println("Igbo");
//                break;
//            case 4 :
//                System.out.println("Hausa");
//                break;
//        }



// Nokia


//        System.out.println("Press 1 for Phone book");
//        System.out.println("Press 2 for Messages");
//        System.out.println("Press 3 for Chat");
//        System.out.println("Press 4 for Call Register");
//        System.out.println("Press 5 for Tones");
//        System.out.println("Press 6 for Settings");
//        System.out.println("Press 7 for Call divert");
//        System.out.println("Press 8 for Games");
//        System.out.println("Press 9 for Calculator");
//        System.out.println("Press 10 for Reminders");
//        System.out.println("Press 11 for Clock");
//        System.out.println("Press 12 for Profiles");
//        System.out.println("Press 13 for Sim services");
//
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//
//        switch(number) {
//            case 1:
//                System.out.println("press 1 for search");
//                System.out.println("press 2 for service no");
//                System.out.println("press 3 for add name");
//                System.out.println("press 4 for erase");
//                System.out.println("press 5 for edit");
//                System.out.println("press 6 for assign tone");
//                System.out.println("press 7 for send b'card");
//                System.out.println("press 8 for options");
//                System.out.println("press 9 for speed dials");
//                System.out.println("press 10 for voice tags");
//
//                number = input.nextInt();
//
//                if (number == 1) System.out.println("search");
//                else if (number == 2) System.out.println("service no");
//                else if (number == 3) System.out.println("add name");
//                else if (number == 4) System.out.println("erase");
//                else if (number == 5) System.out.println("edit");
//                else if (number == 6) System.out.println("Assign tone");
//                else if (number == 7) System.out.println("send d'board");
//                else if (number == 8) {
//                    System.out.println("options");
//                    System.out.println("press 1 for type of view");
//                    System.out.println("press 2 for memory status");
//
//                    number = input.nextInt();
//
//                    if (number == 1) {
//                        System.out.println("Type of view");
//                    } else {
//                        System.out.println("memory status");
//                    }
//                }
//                else if(number == 9) System.out.println("speed dials");
//                else System.out.println("voice tags");
//                    break;
//
//
//            case 2:
//                System.out.println("press 1 for write messages");
//                System.out.println("press 2 for inbox");
//                System.out.println("press 3 for outbox");
//                System.out.println("press 4 for picture messages");
//                System.out.println("press 5 for templates");
//                System.out.println("press 6 for smileys");
//                System.out.println("press 7 for message settings");
//                System.out.println("press 8 for info services");
//                System.out.println("press 9 for voice mailbox number");
//                System.out.println("press 10 for service command editor");
//
//                number = input.nextInt();
//
//                switch(number){
//                    case 1:
//                        System.out.println("write messages");
//                        break;
//                    case 2:
//                        System.out.println("inbox");
//                        break;
//                    case 3:
//                        System.out.println("outbox");
//                        break;
//                    case 4:
//                        System.out.println("picture messages");
//                        break;
//                    case 5:
//                        System.out.println("templates");
//                        break;
//                    case 6:
//                        System.out.println("smileys");
//                        break;
//                    case 7:
//                        System.out.println("Message setting");
//                        System.out.println("Press 1 for set 1");
//                        System.out.println("press 2 for common");
//
//                        number = input.nextInt();
//
//                        if (number == 1){
//                            System.out.println("press 1 for message centre number");
//                            System.out.println("press 2 for message sent as");
//                            System.out.println("press 3 for message validity");
//
//                        number = input.nextInt();
//
//                        if (number == 1) {System.out.println("centre number");}
//                        else if (number == 2) {System.out.println("message sent as");}
//                        else {System.out.println("message validity");}}
//
//                        else {
//                            System.out.println("press 1 for delivery reports");
//                            System.out.println("press 2 for reply via same centre");
//                            System.out.println("press 3 for character support");
//
//                            number = input.nextInt();
//
//                            if (number == 1) {System.out.println("delivery reports");}
//                            else if (number == 2) {System.out.println("reply via same centre");}
//                            else {System.out.println("character support");}
//
//                        }
//                        break;
//
//                    case 8:
//                        System.out.println("info services");
//                        break;
//                    case 9:
//                        System.out.println("voice mail box numbers");
//                        break;
//                    case 10:
//                        System.out.println("service command editor");
//                        break;
//
//                }
//                break;
//
//            case 3:
//                System.out.println("chat");
//                break;
//
//            case 4:
//                System.out.println("press 1 for missed calls");
//                System.out.println("press 2 for recieved calls");
//                System.out.println("press 3 for dialled number");
//                System.out.println("press 4 for erase recent call lists");
//                System.out.println("press 5 for show call duration");
//                System.out.println("press 6 for show call costs");
//                System.out.println("press 7 for call cost settings");
//                System.out.println("press 8 for prepaid credit");
//
//                number = input.nextInt();
//
//                switch(number){
//                    case 1:
//                        System.out.println("missed calls");
//                        break;
//                    case 2:
//                        System.out.println("recieved calls");
//                        break;
//                    case 3:
//                        System.out.println("dialled numbers");
//                        break;
//                    case 4:
//                        System.out.println("erase recent calls");
//                        break;
//                    case 5:
//                        System.out.println("show call duration");
//                        System.out.println("press 1 for last call duration");
//                        System.out.println("press 2 for all calls duration");
//                        System.out.println("press 3 for recieved calls duration");
//                        System.out.println("press 4 for dialled calls duration");
//                        System.out.println("press 5 for clear timers");
//
//                        number = input.nextInt();
//
//                        if (number == 1) System.out.println("last call duration");
//                        else if(number == 2) System.out.println("all calls' duration");
//                        else if ( number == 3) System.out.println("received call duration");
//                        else if(number == 4) System.out.println("dialled calls duration");
//                        else System.out.println("clear timers");
//
//                        break;
//                    case 6:
//                        System.out.println("show call costs");
//                        System.out.println("press 1 for last call cost");
//                        System.out.println("press 2 for all call's cost");
//                        System.out.println("press 3 for clear counters");
//
//                        number = input.nextInt();
//
//                        if (number == 1) System.out.println("last call cost");
//                        else if(number == 2) System.out.println("all calls' cost");
//                        else System.out.println("clear counters");
//
//                        break;
//
//                    case 7:
//                        System.out.println("call cost settings");
//                        System.out.println("call cost limit");
//                        System.out.println("show costs in");
//
//                        number = input.nextInt();
//
//                        if (number == 1) System.out.println("call cost limit");
//                        else System.out.println("show cost in");
//
//                        break;
//
//                    case 8:
//                        System.out.println("prepaid credit");
//                        break;
//                }
//                break;
//
//            case 5:
//                System.out.println("press 1 for ringing tones");
//                System.out.println("press 2 for ringing volumes");
//                System.out.println("press 3 for incoming call alert");
//                System.out.println("press 4 for composer");
//                System.out.println("press 5 for message alert tone");
//                System.out.println("press 6 for keypad tones");
//                System.out.println("press 7 for warning and game tunes");
//                System.out.println("press 8 for vibrating alert");
//                System.out.println("press 9 for screen saver");
//
//                number = input.nextInt();
//
//                switch(number){
//                    case 1:
//                        System.out.println("ringing tones");
//                        break;
//                    case 2:
//                        System.out.println("ringing volumes");
//                        break;
//                    case 3:
//                        System.out.println("incoming call alerts");
//                        break;
//                    case 4:
//                        System.out.println("composer");
//                        break;
//                    case 5:
//                        System.out.println("message alert tone");
//                        break;
//                    case 6:
//                        System.out.println("keypad tones");
//                        break;
//                    case 7:
//                        System.out.println("warning and game tunes");
//                        break;
//                    case 8:
//                        System.out.println("vibrating alert");
//                        break;
//                    case 9:
//                        System.out.println("screen saver");
//                        break;
//                }
//                break;
//
//            case 6:
//                System.out.println("press 1 for call settings");
//                System.out.println("press 2 for phone settings");
//                System.out.println("press 3 for security settings");
//                System.out.println("press 4 for Restore factory settings");
//
//                number = input.nextInt();
//
//                 switch(number){
//                     case 1:
//                         System.out.println("press 1 for automatic redial");
//                         System.out.println("press 2 for speed dialling");
//                         System.out.println("press 3 for call waiting options");
//                         System.out.println("press 4 for own number sending");
//                         System.out.println("press 5 for phone line in use");
//                         System.out.println("press 6 for automatic answer");
//
//                         number = input.nextInt();
//
//                         if (number == 1) System.out.println("call settings");
//                         else if(number == 2) System.out.println("speed dialling");
//                         else if (number == 3) System.out.println("call waiting options");
//                         else if (number == 4) System.out.println("own number sending");
//                         else if (number == 5) System.out.println("phone line in use");
//                          else  System.out.println("automatic answer");
//
//                          break;
//
//                     case 2:
//                         System.out.println("press 1 for language");
//                         System.out.println("press 2 for cell info display");
//                         System.out.println("press 3 for welcome note");
//                         System.out.println("press 4 for network selection");
//                         System.out.println("press 5 for lights");
//                         System.out.println("press 6 for confirm sim service actions");
//
//                         number = input.nextInt();
//
//                         if (number == 1) System.out.println("language");
//                         else if(number == 2) System.out.println("cell info display");
//                         else if (number == 3) System.out.println("welcome note");
//                         else if (number == 4) System.out.println("network selection");
//                         else if (number == 5) System.out.println("lights");
//                         else  System.out.println("confirm sim service actions");
//
//                         break;
//
//                     case 3:
//                         System.out.println("press 1 for pin code request");
//                         System.out.println("press 2 for call barring service");
//                         System.out.println("press 3 for fixed dialling");
//                         System.out.println("press 4 for closed user group");
//                         System.out.println("press 5 for phone secuirity");
//                         System.out.println("press 6 for change access code");
//
//                         number = input.nextInt();
//
//                         if (number == 1) System.out.println("pin code request");
//                         else if(number == 2) System.out.println("call barring service");
//                         else if (number == 3) System.out.println("fixed dialling");
//                         else if (number == 4) System.out.println("closed user group");
//                         else if (number == 5) System.out.println("phone security");
//                         else  System.out.println("change access code");
//
//                         break;
//
//                     case 4:
//                         System.out.println("restore factory settings");
//                         break;
//
//                 }
//
//                 break;
//
//
//            case 7:
//                System.out.println("call divert");
//                break;
//
//            case 8:
//                System.out.println("games");
//                break;
//
//            case 9:
//                System.out.println("calculator");
//                break;
//
//            case 10:
//                System.out.println("reminders");
//                break;
//
//            case 11:
//                System.out.println("press 1 for alarm clock");
//                System.out.println("press 2 for clock settings");
//                System.out.println("press 3 for date settings");
//                System.out.println("press 4 for stop watch");
//                System.out.println("press 5 for countdown timer");
//                System.out.println("press 6 for auto update of date and time");
//
//                number = input.nextInt();
//
//                if (number == 1) System.out.println("alarm clock");
//                else if(number == 2) System.out.println("clock settings");
//                else if (number == 3) System.out.println("date settings");
//                else if (number == 4) System.out.println("stop watch");
//                else if (number == 5) System.out.println("countdown timer");
//                else  System.out.println("auto update of date and time");
//
//                break;
//
//            case 12:
//                System.out.println("profiles");
//                break;
//
//            case 13:
//                System.out.println("sim services");
//                break;
//
//        }//first switch statement
//
//

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a four digit integer: ");
//        String fourDigit = input.nextLine();
//        while(fourDigit.length() != 4 || !fourDigit.matches("^[0-9]+$") ) {
//            System.out.println("Please input a four digit integer");
//            fourDigit = input.nextLine();
//        }
//
//        int fourDigitInteger = Integer.parseInt(fourDigit);
//
//        int fourthDigit = fourDigitInteger % 10;
//        int threeDigitInteger = fourDigitInteger / 10;
//        int thirdDigit = threeDigitInteger % 10;
//        int twoDigitInteger = threeDigitInteger / 10;
//        int secondDigit = twoDigitInteger % 10;
//        int firstDigit = twoDigitInteger / 10;
//
//        System.out.printf("%d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);
//
//        int firstDigitPlus7 = firstDigit + 7;
//        int secondDigitPlus7 = secondDigit + 7;
//        int thirdDigitPlus7 = thirdDigit + 7;
//        int fourthDigitPlus7 = fourthDigit + 7;
//
//        System.out.printf("%d%d%d%d%n", firstDigitPlus7, secondDigitPlus7, thirdDigitPlus7, fourthDigitPlus7);
//
//        int newFirstDigit = firstDigitPlus7 % 10;
//        int newSecondDigit = secondDigitPlus7 % 10;
//        int newThirdDigit = thirdDigitPlus7 % 10;
//        int newFourthDigit = fourthDigitPlus7 % 10;
//
//
//        int dividedFirstDigit = firstDigitPlus7 / 10;
//        int dividedSecondDigit = secondDigitPlus7 / 10;
//        int dividedThirdDigit = thirdDigitPlus7 / 10;
//        int dividedFourthDigit = fourthDigitPlus7 / 10;
//
//
//        System.out.printf("%d%d%d%d%n", newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit);
//
//        int temp;
//
//        temp = newFirstDigit;
//        newFirstDigit = newSecondDigit;
//        newSecondDigit = newThirdDigit;
//        newThirdDigit = newFourthDigit;
//        newFourthDigit = temp;
//        temp = newFirstDigit;
//        newFirstDigit = newSecondDigit;
//        newSecondDigit = newThirdDigit;
//        newThirdDigit = newFourthDigit;
//        newFourthDigit = temp;
//
//        System.out.printf("%d%d%d%d%n", newFirstDigit, newSecondDigit, newThirdDigit, newFourthDigit);
//
//// Decryption





        //world population

//        double worldPopulation = 8_000_000_000.00;
//        double growthRate = 0.009; //0.9%
//        int counter = 1;
//        int noOfYears = 75;
//        double difference;
//
//        System.out.printf("%s %20s %15s%n", "Year", "World Population", "Increase");
//
//
//        while(counter <= noOfYears){
//            worldPopulation = worldPopulation + (worldPopulation * growthRate);
//            difference = (worldPopulation + (worldPopulation * growthRate)) - worldPopulation;
//            System.out.printf("%d %20.2f %20.2f%n", counter, worldPopulation, difference);
//            counter++;
//
 //       }


      //  factorial

//        int counter = 5;
//        int total = 1;
//        int factorialLimit = 1;
//
//        while(counter >= factorialLimit){
//            System.out.printf("%s * %s%n", total ,counter);
//            total = total * counter;
//            System.out.println(total);
//            counter--;
//
//        }



//        int i = 1;
//        while (i <= 10) {
//            int j = i;
//            while (j <= 10) {
//                System.out.print("*");
//                j++;
//            }
//
//            System.out.println();
//            i++;
//        }


//        double x = 1;
//        for(int i = 0; i < 10; i++){
//            x = Math.pow(3, 2);
//        }
//
//        System.out.println(x);

        //barchart
//        int counter =1;
//        while(counter <= 5) {
//            int count;
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            int number = input.nextInt();
//            if (number >= 1 && number <= 30) {
//                count = 1;
//                while (count <= number) {
//                    System.out.print("*");
//                    count++;
//
//                }
//
//            }
//
//            System.out.println();
//            counter++;
//        }
    }

}


