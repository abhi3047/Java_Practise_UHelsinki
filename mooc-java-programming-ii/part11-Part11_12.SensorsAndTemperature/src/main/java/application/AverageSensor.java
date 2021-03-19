package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors=new ArrayList<>();
        this.readings=new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean status = true;
        for(Sensor sensor:sensors){
            if(sensor.isOn()==false) {
                status = false;
            }
        }
        return status;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(sensor -> sensor.setOn());

    }

    @Override
    public void setOff() {
        sensors.stream().forEach(Sensor::setOff);
    }

    @Override
    public int read() {
        if(this.sensors.isEmpty() || this.isOn()==false){
            throw new IllegalStateException();
        }
        int sum=0;
        for(Sensor sensor:sensors){
            sum=sum +sensor.read();
        }
        int avg = sum/sensors.size();
        readings.add(avg);
        return avg;
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    public List<Integer> readings(){

        return readings;
    }
}
