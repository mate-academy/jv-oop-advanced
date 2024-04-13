package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double aside;

    private double bside;

    private double height;

    public IsoscelesTrapezoid(String color, double aside, double bside, double height) {
        super.setColor(color);
        this.aside = aside;
        this.bside = bside;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles еrapezoid was drawn");
    }

    @Override
    public double getArea() {
        return (aside + bside) / 2 * height;
    }

    @Override
    public String toString() {
        return super.toString() + "isosceles trapezoid, area: " + this.getArea()
                + " sq. units, a: " + this.aside + " units, b: " + this.bside
                + " units, height: " + this.height + " units, color: " + super.getColor();
    }
}
