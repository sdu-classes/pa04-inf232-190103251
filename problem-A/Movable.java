abstract interface Movaable {
    abstract void moveUp();
    abstract void moveDown();
    abstract void moveLeft();
    abstract void moveRight();

}

public class Movable{
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint(10,10,1,1);
        mv.moveDown();
        mv.moveRight();
        System.out.println(mv.toString());
        MovableCircle mc = new MovableCircle(10,10,1,1,5);
        mc.moveUp();
        mc.moveLeft();
        System.out.println(mc.toString());
    }
}

