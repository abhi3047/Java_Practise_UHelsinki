public class Book implements Packable {

    private String authorName;
    private String bookName;
    private double bookWeight;

    public Book(String authorName,String bookName,double bookWeight){
        this.authorName=authorName;
        this.bookName=bookName;
        this.bookWeight=bookWeight;
    }

    @Override
    public double weight(){
        return this.getBookWeight();
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public double getBookWeight() {
        return bookWeight;
    }

    @Override
    public String toString(){
        String text=this.getAuthorName()+": "+this.getBookName();
        return text;
    }
}


