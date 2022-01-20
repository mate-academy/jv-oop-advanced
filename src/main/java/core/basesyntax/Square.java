package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public void calculateArea() {
        setArea(this.side * this.side);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, side: " + this.side + "color: " + getColor());
    }
}
