
public class HealthStation {
    private int weighingsCount=0;
//    private Person person;


    public int weigh(Person person) {
        this.weighingsCount++;
        // return the weight of the person passed as the parameter
        return person.getWeight();

    }

    public void feed(Person person){
       person.increaseWeight(1);
    }
    public int weighings(){
        return this.weighingsCount;
    }

}
