public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restingHeartRate=restingHeartRate;
    }
    public double percentageOfMaximum(){
        return 206.3 - (0.711 * age);
    }

    public double targetHeartRate(double percentage){
        double targetHeartRate=(percentageOfMaximum() - restingHeartRate) * (percentage) + restingHeartRate;
        return targetHeartRate;

    }

    public int getAge() {
        return age;
    }

    public int getRestingHeartRate() {
        return restingHeartRate;
    }
}
