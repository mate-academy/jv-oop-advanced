package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, String color) {
        super("rectangle", color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, color: " + color);
    }
}
