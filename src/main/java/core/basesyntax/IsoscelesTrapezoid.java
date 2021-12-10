package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;

    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase() {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double scale = Math.pow(10, 2);
        double area = (firstBase + secondBase) / 2 * height;
        return Math.ceil(area * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + "area: " + getArea()
                + " sq.units, first base: " + (int)firstBase + " units, second base: "
                + (int)secondBase + " units, height: " + (int)height + " units, color: "
                + getColor());
    }
}
