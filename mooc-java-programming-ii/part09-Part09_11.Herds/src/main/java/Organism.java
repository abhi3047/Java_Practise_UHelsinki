public class Organism implements Movable {

    private int dx;
    private int dy;

    public Organism(int dx, int dy){
        this.dx=dx;
        this.dy=dy;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    @Override
    public String toString(){
        String text = "x: "+this.getDx()+"; y: "+this.getDy();
        return text;
    }

    @Override
    public void move(int dx, int dy) {
        this.setDx(this.dx+dx);
        this.setDy(this.dy+dy);
    }
}
