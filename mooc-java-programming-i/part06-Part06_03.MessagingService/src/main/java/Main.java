
public class Main {

    public static void main(String[] args) {
        Message msg1=new Message("kohul","sscsdcdksbcbdskcdsbcbsdckScshcvsdjl");
        MessagingService fedex=new MessagingService();
        fedex.add(msg1);
        System.out.println(fedex.getMessages());

        // Try out your class here
    }
}
