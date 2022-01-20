package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public void calculateArea() {
        setArea((this.side * this.side) / 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + this.side
                + " units, " + "color: " + getColor());
    }
}
