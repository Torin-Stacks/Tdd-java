package tdd;

public class SwitchStatement {

    public String checkWeatherCondition(String weatherCondition){

        switch(weatherCondition){
            case "sunny day":
//                System.out.println("Take out your sunshades");
//                break;
                return "Take out your sunshades";

            case "windy day":
                return "Take out your jacket";

                case "rainy day":
                return "Take out your umbrella";

            case "snowy day":
                return "stay at home";

            default: return "na your problem be that";




        }
    }
}
