public class Book {
    private String authorName;
    private String bookName;
    private int pageCount;


    public Book(String authorName,String bookName,int pageCount){
        this.authorName=authorName;
        this.bookName=bookName;
        this.pageCount=pageCount;
    }

    public String getAuthor() {
        return authorName;
    }

    public String getName() {
        return bookName;
    }

    public int getPages() {
        return pageCount;
    }

    public String toString(){
        return this.authorName+", "+this.bookName+", "+this.pageCount+" pages";
    }
}
