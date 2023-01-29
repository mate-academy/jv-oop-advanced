package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        super("isosceles trapezoid", color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (firstBase + secondBase) / 2;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq.units, firstBase: "
                + firstBase + " units, secondBase: " + secondBase + " units, color: " + color);
    }
}
