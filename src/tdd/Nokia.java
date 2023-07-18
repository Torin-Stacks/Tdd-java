package tdd;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {
        phone();
    }


    public static void phone() {

        System.out.println("Press 1 for Phone book");
        System.out.println("Press 2 for Messages");
        System.out.println("Press 3 for Chat");
        System.out.println("Press 4 for Call Register");
        System.out.println("Press 5 for Tones");
        System.out.println("Press 6 for Settings");
        System.out.println("Press 7 for Call divert");
        System.out.println("Press 8 for Games");
        System.out.println("Press 9 for Calculator");
        System.out.println("Press 10 for Reminders");
        System.out.println("Press 11 for Clock");
        System.out.println("Press 12 for Profiles");
        System.out.println("Press 13 for Sim services");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number) {
            case 1:
                   phoneBook();
                break;

            case 2:
                   messages();
                break;

            case 3:
                System.out.println("chat");
                System.out.println("press 11 to go back");
                number = input.nextInt();
                if (number == 11) phone();
                break;

            case 4:
                System.out.println("press 1 for missed calls");
                System.out.println("press 2 for recieved calls");
                System.out.println("press 3 for dialled number");
                System.out.println("press 4 for erase recent call lists");
                System.out.println("press 5 for show call duration");
                System.out.println("press 6 for show call costs");
                System.out.println("press 7 for call cost settings");
                System.out.println("press 8 for prepaid credit");
                System.out.println("press 9 to go back");

                number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("missed calls");
                        break;
                    case 2:
                        System.out.println("recieved calls");
                        break;
                    case 3:
                        System.out.println("dialled numbers");
                        break;
                    case 4:
                        System.out.println("erase recent calls");
                        break;
                    case 5:
                        System.out.println("show call duration");
                        System.out.println("press 1 for last call duration");
                        System.out.println("press 2 for all calls duration");
                        System.out.println("press 3 for recieved calls duration");
                        System.out.println("press 4 for dialled calls duration");
                        System.out.println("press 5 for clear timers");

                        number = input.nextInt();

                        if (number == 1) System.out.println("last call duration");
                        else if (number == 2) System.out.println("all calls' duration");
                        else if (number == 3) System.out.println("received call duration");
                        else if (number == 4) System.out.println("dialled calls duration");
                        else if (number == 5) System.out.println("clear timers");
                        else System.out.println("press 11 to go back");
                        number = input.nextInt();
                        if (number == 11) phone();
                        break;
                    case 6:
                        System.out.println("show call costs");
                        System.out.println("press 1 for last call cost");
                        System.out.println("press 2 for all call's cost");
                        System.out.println("press 3 for clear counters");

                        number = input.nextInt();

                        if (number == 1) System.out.println("last call cost");
                        else if (number == 2) System.out.println("all calls' cost");
                        else if(number == 3) System.out.println("clear counters");
                        else System.out.println("press 11 to go back");
                        number = input.nextInt();
                        if (number == 11) phone();

                        break;

                    case 7:
                        System.out.println("call cost settings");
                        System.out.println("call cost limit");
                        System.out.println("show costs in");

                        number = input.nextInt();

                        if (number == 1) System.out.println("call cost limit");
                        else if (number == 2)System.out.println("show cost in");
                        else System.out.println("press 11 to go back");
                        number = input.nextInt();
                        if (number == 11) phone();


                        break;

                    case 8:
                        System.out.println("prepaid credit");
                        System.out.println("press 11 to go back");
                        number = input.nextInt();
                        if (number == 11) phone();
                        break;

                    case 9: phone();
                    break;
                }
                break;

            case 5:
                System.out.println("press 1 for ringing tones");
                System.out.println("press 2 for ringing volumes");
                System.out.println("press 3 for incoming call alert");
                System.out.println("press 4 for composer");
                System.out.println("press 5 for message alert tone");
                System.out.println("press 6 for keypad tones");
                System.out.println("press 7 for warning and game tunes");
                System.out.println("press 8 for vibrating alert");
                System.out.println("press 9 for screen saver");
                System.out.println("press 10 to go back");

                number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("ringing tones");
                        break;
                    case 2:
                        System.out.println("ringing volumes");
                        break;
                    case 3:
                        System.out.println("incoming call alerts");
                        break;
                    case 4:
                        System.out.println("composer");
                        break;
                    case 5:
                        System.out.println("message alert tone");
                        break;
                    case 6:
                        System.out.println("keypad tones");
                        break;
                    case 7:
                        System.out.println("warning and game tunes");
                        break;
                    case 8:
                        System.out.println("vibrating alert");
                        break;
                    case 9:
                        System.out.println("screen saver");
                        break;
                    case 10: phone();
                }
                break;

            case 6:
                System.out.println("press 1 for call settings");
                System.out.println("press 2 for phone settings");
                System.out.println("press 3 for security settings");
                System.out.println("press 4 for Restore factory settings");
                System.out.println("press 5 to go back");

                number = input.nextInt();

                switch (number) {
                    case 1:
                        System.out.println("press 1 for automatic redial");
                        System.out.println("press 2 for speed dialling");
                        System.out.println("press 3 for call waiting options");
                        System.out.println("press 4 for own number sending");
                        System.out.println("press 5 for phone line in use");
                        System.out.println("press 6 for automatic answer");
                        System.out.println("press 11 to go back");

                        number = input.nextInt();

                        if (number == 1) System.out.println("call settings");
                        else if (number == 2) System.out.println("speed dialling");
                        else if (number == 3) System.out.println("call waiting options");
                        else if (number == 4) System.out.println("own number sending");
                        else if (number == 5) System.out.println("phone line in use");
                        else if (number == 6)System.out.println("automatic answer");
                        else phone();

                        break;

                    case 2:
                        System.out.println("press 1 for language");
                        System.out.println("press 2 for cell info display");
                        System.out.println("press 3 for welcome note");
                        System.out.println("press 4 for network selection");
                        System.out.println("press 5 for lights");
                        System.out.println("press 6 for confirm sim service actions");
                        System.out.println("press 11 to go back");

                        number = input.nextInt();

                        if (number == 1) System.out.println("language");
                        else if (number == 2) System.out.println("cell info display");
                        else if (number == 3) System.out.println("welcome note");
                        else if (number == 4) System.out.println("network selection");
                        else if (number == 5) System.out.println("lights");
                        else if (number == 6)System.out.println("confirm sim service actions");
                        else phone();
                        break;

                    case 3:
                        System.out.println("press 1 for pin code request");
                        System.out.println("press 2 for call barring service");
                        System.out.println("press 3 for fixed dialling");
                        System.out.println("press 4 for closed user group");
                        System.out.println("press 5 for phone secuirity");
                        System.out.println("press 6 for change access code");
                        System.out.println("press 11 to go back");

                        number = input.nextInt();

                        if (number == 1) System.out.println("pin code request");
                        else if (number == 2) System.out.println("call barring service");
                        else if (number == 3) System.out.println("fixed dialling");
                        else if (number == 4) System.out.println("closed user group");
                        else if (number == 5) System.out.println("phone security");
                        else if(number == 6)System.out.println("change access code");
                        else phone();
                        break;

                    case 4:
                        System.out.println("restore factory settings");
                        System.out.println("press 11 to go back");
                        number = input.nextInt();
                        if (number == 11) phone();
                        break;

                    case 5: phone();

                }

                break;


            case 7:
                System.out.println("call divert");
                break;

            case 8:
                System.out.println("games");
                break;

            case 9:
                System.out.println("calculator");
                break;

            case 10:
                System.out.println("reminders");
                break;

            case 11:
                System.out.println("press 1 for alarm clock");
                System.out.println("press 2 for clock settings");
                System.out.println("press 3 for date settings");
                System.out.println("press 4 for stop watch");
                System.out.println("press 5 for countdown timer");
                System.out.println("press 6 for auto update of date and time");
                System.out.println("press 7 to go back");

                number = input.nextInt();

                if (number == 1) System.out.println("alarm clock");
                else if (number == 2) System.out.println("clock settings");
                else if (number == 3) System.out.println("date settings");
                else if (number == 4) System.out.println("stop watch");
                else if (number == 5) System.out.println("countdown timer");
                else if (number == 6)System.out.println("auto update of date and time");
                else phone();

                break;

            case 12:
                System.out.println("profiles");
                break;

            case 13:
                System.out.println("sim services");
                break;

        }//first switch statement


    }

    public static void phoneBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("press 1 for search");
        System.out.println("press 2 for service no");
        System.out.println("press 3 for add name");
        System.out.println("press 4 for erase");
        System.out.println("press 5 for edit");
        System.out.println("press 6 for assign tone");
        System.out.println("press 7 for send b'card");
        System.out.println("press 8 for options");
        System.out.println("press 9 for speed dials");
        System.out.println("press 10 for voice tags");
        System.out.println("press 11 to return to previous menu");

        int number = input.nextInt();

        if (number == 1) System.out.println("search");
        else if (number == 2) System.out.println("service no");
        else if (number == 3) System.out.println("add name");
        else if (number == 4) System.out.println("erase");
        else if (number == 5) System.out.println("edit");
        else if (number == 6) System.out.println("Assign tone");
        else if (number == 7) System.out.println("send d'board");
        else if (number == 8) {
            System.out.println("options");
            System.out.println("press 1 for type of view");
            System.out.println("press 2 for memory status");
            System.out.println("press 3 to go back");

            number = input.nextInt();

            if (number == 1) {
                System.out.println("Type of view");
            } else if (number == 2){
                System.out.println("memory status");
            }
            else phoneBook();
        } else if (number == 9) System.out.println("speed dials");
        else if (number == 10) System.out.println("voice tags");
        else phone();
    }

    public static void messages(){
        System.out.println("press 1 for write messages");
        System.out.println("press 2 for inbox");
        System.out.println("press 3 for outbox");
        System.out.println("press 4 for picture messages");
        System.out.println("press 5 for templates");
        System.out.println("press 6 for smileys");
        System.out.println("press 7 for message settings");
        System.out.println("press 8 for info services");
        System.out.println("press 9 for voice mailbox number");
        System.out.println("press 10 for service command editor");
        System.out.println("press 11 to go back");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        switch (number) {
            case 1:
                System.out.println("write messages");
                break;
            case 2:
                System.out.println("inbox");
                break;
            case 3:
                System.out.println("outbox");
                break;
            case 4:
                System.out.println("picture messages");
                break;
            case 5:
                System.out.println("templates");
                break;
            case 6:
                System.out.println("smileys");
                break;
            case 7:
                System.out.println("Message setting");
                System.out.println("Press 1 for set 1");
                System.out.println("press 2 for common");
                System.out.println("press 3 to go back");

                number = input.nextInt();

                if(number == 1) {
                    System.out.println("press 1 for message centre number");
                    System.out.println("press 2 for message sent as");
                    System.out.println("press 3 for message validity");
                    System.out.println("press 4 to go back");

                    number = input.nextInt();

                    if (number == 1) {
                        System.out.println("centre number");
                    } else if (number == 2) {
                        System.out.println("message sent as");
                    } else if(number == 3){
                        System.out.println("message validity");
                    }
                    else messages();
                }

                else {
                    System.out.println("press 1 for delivery reports");
                    System.out.println("press 2 for reply via same centre");
                    System.out.println("press 3 for character support");
                    System.out.println("press 4 to go back");

                    number = input.nextInt();

                    if (number == 1) {
                        System.out.println("delivery reports");
                    } else if (number == 2) {
                        System.out.println("reply via same centre");
                    } else if(number == 3){
                        System.out.println("character support");
                    }
                    else messages();

                }
                break;

            case 8:
                System.out.println("info services");
                break;
            case 9:
                System.out.println("voice mail box numbers");
                break;
            case 10:
                System.out.println("service command editor");
            case 11: phone();
                break;

        }

//        public static void messageSettings(){
//            System.out.println("Message setting");
//            System.out.println("Press 1 for set 1");
//            System.out.println("press 2 for common");
//            System.out.println("press 3 to go back");
//
//
//            if(number == 1) {
//                System.out.println("press 1 for message centre number");
//                System.out.println("press 2 for message sent as");
//                System.out.println("press 3 for message validity");
//                System.out.println("press 4 to go back");
//
//                number = input.nextInt();
//
//                if (number == 1) {
//                    System.out.println("centre number");
//                } else if (number == 2) {
//                    System.out.println("message sent as");
//                } else if(number == 3){
//                    System.out.println("message validity");
//                }
//                else messages();
//            }
//
//            else {
//                System.out.println("press 1 for delivery reports");
//                System.out.println("press 2 for reply via same centre");
//                System.out.println("press 3 for character support");
//                System.out.println("press 4 to go back");
//
//                number = input.nextInt();
//
//                if (number == 1) {
//                    System.out.println("delivery reports");
//                } else if (number == 2) {
//                    System.out.println("reply via same centre");
//                } else if(number == 3){
//                    System.out.println("character support");
//                }
//                else messages();
//
//            }
//        }
   }
}// closing bracket for  class nokia