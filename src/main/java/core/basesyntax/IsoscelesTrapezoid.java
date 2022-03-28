package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private double basis1;
    private double basis2;
    private double height;

    private String color;

    public IsoscelesTrapezoid(double basis1, double basis2, double height, String color) {

        this.basis1 = basis1;
        this.basis2 = basis2;
        this.color = color;
        this.height = height;
    }

    public String getName() {
        return "ssosceles_trapezoid";
    }

    public double getBasis1() {
        return basis1;
    }

    public void setBasis1(double basis1) {
        this.basis1 = basis1;
    }

    public double getBasis2() {
        return basis2;
    }

    public void setBasis2(double basis2) {
        this.basis2 = basis2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return ((basis1 + basis2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + " area: " + area() + " sq.units, basis1: "
                + getBasis1() + " units, " + "basis2: " + getBasis2() + " units, "
                + "height: " + getHeight() + " units, color: " + color());
    }
}
