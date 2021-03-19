import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> personList;

    public Employees(){
        this.personList=new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.personList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        peopleToAdd.stream().forEach(person ->{
            this.add(person);
        });
    }

    public void print(){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void print(Education education){
        Iterator<Person> iterator = personList.iterator();
        while(iterator.hasNext()){
            Person thatPerson = iterator.next();

            if(thatPerson.getEducation()==education){
                System.out.println(thatPerson);
            }

        }
    }

    public void fire(Education education){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }

}
