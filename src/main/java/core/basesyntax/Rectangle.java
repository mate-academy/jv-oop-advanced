package core.basesyntax;

public class Rectangle extends Figure {
    private double side;
    private double heightToSide;

    public Rectangle(String name, String color, double side, double heightToSide) {
        super(name, color);
        this.side = side;
        this.heightToSide = heightToSide;
    }

    @Override
    public void calculateArea() {
        setArea((this.side * this. heightToSide) / 2);
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, " + "side: " + this.side
                + " units, " + "heightToSide: " + heightToSide + " sq.units, "
                + "color: " + getColor());
    }
}
