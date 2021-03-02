package core.basesyntax;

public class Square extends BaseFigure implements Behaviour {
    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square with color: " + getColor() + " and side: " + side);
    }
}
