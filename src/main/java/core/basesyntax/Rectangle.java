package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }
}
