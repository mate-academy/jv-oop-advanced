package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, String figuresName, double side) {
        super(color, figuresName);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, side length: " + side
                + " units, color: " + getColor());
    }
}
