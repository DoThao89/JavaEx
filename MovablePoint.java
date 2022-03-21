package ExampleMove;

public class MovablePoint implements Movable{
    private int x;
    private int y;

    public MovablePoint() {
    }
    public MovablePoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x++;
    }

    @Override
    public void moveRight() {
        x--;
    }
    public void display(){
        System.out.println("x;y="+x+";"+y);
    }
}

class test{
    public static void main(String[] args) {
        MovablePoint m1=new MovablePoint(10,10);
        m1.display();
        System.out.print("MoveUp: ");
        m1.moveUp();
        m1.display();
        System.out.print("MoveDown: ");
        m1.moveDown();
        m1.display();
        System.out.print("MoveRight: ");
        m1.moveRight();
        m1.display();
        System.out.print("MoveLeft: ");
        m1.moveLeft();
        m1.display();

    }
}

