package tdd;

public class Airconditioner {

    private boolean isOn;
    private int temperature = 16;


    public void toggleOn() {
        if(isOn) isOn = true;

    }

    public boolean isOn() {
        return isOn;
  }


        public void increaseTemperature() {
            temperature = temperature + 1;
            if (temperature > 30)
                temperature = 30;
        }


        public void decreaseTemperature() {
            temperature = temperature - 1;
            if (temperature < 16)
                temperature = 16;
        }

        public int getTemperature() {
            return temperature;

        }
    }










