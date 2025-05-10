package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", Area: "
                + getArea() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }

}
