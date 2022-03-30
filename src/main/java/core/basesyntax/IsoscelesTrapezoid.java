package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBasis;
    private double secondBasis;
    private double height;

    public IsoscelesTrapezoid(double firstBasis, double secondBasis, double height, String color) {

        super(color);
        this.firstBasis = firstBasis;
        this.secondBasis = secondBasis;
        this.height = height;
    }

    public String getName() {
        return "ssosceles_trapezoid";
    }

    public double getFirstBasis() {
        return firstBasis;
    }

    public void setFirstBasis(double firstBasis) {
        this.firstBasis = firstBasis;
    }

    public double getSecondBasis() {
        return secondBasis;
    }

    public void setSecondBasis(double basis2) {
        this.secondBasis = secondBasis;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBasis + secondBasis) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + " area: " + getArea() + " sq.units, basis1: "
                + firstBasis + " units, " + "basis2: " + secondBasis + " units, "
                + "height: " + height + " units, color: " + getColor());
    }
}
