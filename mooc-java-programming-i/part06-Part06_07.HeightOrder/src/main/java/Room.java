import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personsList;

    public Room(){
        this.personsList=new ArrayList<>();
    }

    public void add(Person person){
        personsList.add(person);

    }
    public boolean isEmpty(){
        if(personsList.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return personsList;
    }

    public Person shortest(){

        if(personsList.isEmpty()){
            return null;
        }
        else {
            Person shortestPerson=personsList.get(0);

            for(Person persons:personsList){
                if(persons.getHeight()<shortestPerson.getHeight()){
                    shortestPerson=persons;
                }
            }
            return shortestPerson;
        }

    }
    public Person take(){
        if(personsList.isEmpty()){
            return null;
        }else {
            Person shortestPerson=this.shortest();
            personsList.remove(this.shortest());
            return shortestPerson;
        }
    }


}
