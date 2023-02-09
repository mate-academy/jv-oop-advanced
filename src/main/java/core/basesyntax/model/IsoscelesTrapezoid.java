package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double firstBase, double secondBase, double height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, firstBase: " + (int)firstBase + " units,"
                + " secondBase: " + (int)secondBase + " units,"
                + " height: " + (int)height + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;

    }
}
