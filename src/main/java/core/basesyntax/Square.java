package core.basesyntax;

public class Square extends Shape implements Drawable, Figure{
    // square formula area is side * side;
    private int side;

    @Override
    public void draw() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
