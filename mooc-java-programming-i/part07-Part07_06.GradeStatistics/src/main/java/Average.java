import java.util.ArrayList;

public class Average {

    private ArrayList<Integer> nos;

    public Average(){
        nos=new ArrayList<>();
    }

    public ArrayList<Integer> getNos() {
        return nos;
    }

    public void setNos(ArrayList<Integer> nos) {
        this.nos = nos;
    }
    public void addNumber(int no){
        if (no >=0 && no<=100){
            this.nos.add(no);

        }

    }
    public double calculateAverage(){
        int length=this.nos.size();
        double sum=0;
        for (int no:nos){
            sum=sum+no;
        }
        double avg=sum/length;
        return avg;

    }
    public double gradeAverage() {
//        int length=this.nos.size();

        double sum = 0;
        int count = 0;
        for (int no : nos) {
            if (no >= 50) {
                sum += no;
                count++;

            }

        }
        if (sum > 0) {
            double avg = sum / count;
            return avg;
        }
        return -1;
    }
    public double passPercentage(){
        double sum=0;
        int length=nos.size();
        for(int no:nos){
            if (no>=50){
                sum++;
            }
        }
        double passPercentage=(sum/length)*100;
        return passPercentage;
    }

    public void star(){
        int[] stars = new int[6];
        for (int no:nos){
            if (no<50){
                stars[0]++;
            }else if (no<60){
                stars[1]++;
            }else if (no<70){
                stars[2]++;
            }else if (no<80){
                stars[3]++;
            }else if (no<90){
                stars[4]++;
            }else if (no>=90){
                stars[5]++;
            }
        }
//
        for (int i=5;i>=0;i--){
            System.out.print(i+":");
            printStars(stars[i]);
            System.out.println();
        }
    }
    public void printStars(int no){
        int count=1;
        while(count<=no){
            System.out.print("*");
            count++;
        }
    }
}
