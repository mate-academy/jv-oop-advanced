package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double aside;
    private double bside;
    private double height;

    public IsoscelesTrapezoid(String color, double aside, double bside, double height) {
        super(color);
        this.aside = aside;
        this.bside = bside;
        this.height = height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("isosceles trapezoid, area: " + this.getArea()
                + " sq. units, a: " + this.aside + " units, b: " + this.bside
                + " units, height: " + this.height + " units, color: "
                + super.getColor());
    }

    @Override
    public double getArea() {
        return (aside + bside) / 2 * height;
    }

}
