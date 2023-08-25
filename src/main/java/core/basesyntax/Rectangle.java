package core.basesyntax;

public class Rectangle extends Figure {
    private double side;
    private double secondSide;

    public Rectangle(String color, double side, double secondSide) {
        super(color);
        this.side = side;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + getArea()
                + " sq.units, " + "firstLeg: " + side
                + " units, " + "secondSide: " + secondSide + " units, " + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * secondSide;
    }
}
