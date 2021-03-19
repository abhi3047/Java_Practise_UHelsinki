public class Book {
    private String name;
    private int age;

    public Book(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        String text = this.getName()+" (recommended for "+this.getAge()+ " year-olds or older)";
        return text;
    }
}
