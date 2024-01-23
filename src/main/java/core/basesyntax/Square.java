package core.basesyntax;

public class Square extends AbstractFigure implements Drawable {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
