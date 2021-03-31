package core.basesyntax;

public class IsoscelesTrapezoid extends Shapes implements Behaviour{
    private int side;
    private int height;

    public void setSide(int side, int height) {
        this.height = height;
        this.side = side;
    }
    /* @Override
    public void draw() {

    }*/

    @Override
    public int area() {
        return side * height;
    }
    /*@Override
    void color() {

    }*/

    @Override
    void figure() {
    System.out.println("IsoscelesTrapezoid");
    }

    @Override
    void uniqueProperty() {
    System.out.println("Have 4 corners");
    }
}
