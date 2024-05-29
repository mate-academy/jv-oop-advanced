package core.basesyntax;

public class Square extends FigureBase {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square [color=" + color + ", side=" + side + "]");
    }
}
