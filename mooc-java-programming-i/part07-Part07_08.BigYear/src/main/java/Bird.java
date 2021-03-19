public class Bird {
    private String birdName;
    private String birdLatinName;
    private int observations;

    public Bird(String birdName, String birdLatinName) {
        this.birdName = birdName;
        this.birdLatinName = birdLatinName;
        this.observations=0;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getBirdLatinName() {
        return birdLatinName;
    }

    public void increaseObservationsByOne(){
        this.observations+=1;
    }

    public void setBirdLatinName(String birdLatinName) {
        this.birdLatinName = birdLatinName;
    }

    public int getObservations() {
        return observations;
    }

    public void setObservations(int observations) {
        this.observations = observations;
    }

    public String toString(){
        String name=this.birdName+" ("+this.birdLatinName+"): "+this.observations+" observations";
        return name;
    }
}
