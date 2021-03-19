public class Product {
    private String name;
    private int age;

    public Product(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    // growOlder() method has been added
    public void growOlder() {
        this.age = this.age + 11;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }
}