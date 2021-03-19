public class Teacher extends Person {

    private int salary;

    public Teacher(String name,String address,int salary){
        super(name,address);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        String name=this.getName()+"\n"+"  "+this.getAddress()+"\n"+"  "+"salary "+this.getSalary()+" euro/month";
        return name;
    }
}
