public class Timer {
    private ClockHand hundredthOfSecond;
    private ClockHand second;

    public Timer(){
        this.hundredthOfSecond =new ClockHand(100);
        this.second=new ClockHand(60);
    }

    public void advance(){
        this.hundredthOfSecond.advance();
        if (this.hundredthOfSecond.value()==0){
            this.second.advance();
        }
    }

    public String toString(){
        return this.second+":"+this.hundredthOfSecond;
    }

    }




