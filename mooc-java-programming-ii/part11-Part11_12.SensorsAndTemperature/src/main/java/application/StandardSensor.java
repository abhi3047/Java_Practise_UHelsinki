package application;

public class StandardSensor implements Sensor {

    private int integer;
//    private boolean status=true;
    public StandardSensor(int integer){
        this.integer=integer;

    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
//        status=true;
    }

    @Override
    public void setOff() {
//        status=true;
    }

    @Override
    public int read() {
        return this.integer;
    }
}
