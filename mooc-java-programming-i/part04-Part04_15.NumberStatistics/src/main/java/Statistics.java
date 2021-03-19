
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        this.count++;
        this.sum = this.sum + number;

        // write code here
    }

    public int getCount() {
        return this.count;
        // write code here
    }

    public int sum() {
        return this.sum;
        // write code here
    }

    public double average() {
        if (getCount() > 0) {
            return (1.0 * this.sum) / this.count;
            // write code here
        }
        return 0;

    }
}
