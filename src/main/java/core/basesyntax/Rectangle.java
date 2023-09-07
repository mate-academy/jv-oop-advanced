package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String name, String color, double firstSide, double secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double areaCalculating() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getName()
                + ", "
                + "area: "
                + areaCalculating()
                + " sq.units, "
                + "first side: "
                + this.firstSide
                + " units, "
                + "second side: "
                + this.secondSide
                + " units, "
                + "color: "
                + getColor());
    }
}
