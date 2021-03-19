package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean status;


    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        status=true;

    }

    @Override
    public void setOff() {
        status=false;

    }

    @Override
    public int read() {
        if(this.isOn()==false){
            throw new IllegalStateException();
        }
        int randomNumber = new Random().nextInt(61)-30;
        return randomNumber;
    }
}
