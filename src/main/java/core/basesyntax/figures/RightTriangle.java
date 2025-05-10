package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double aside;
    private double bside;

    public RightTriangle(String color, double aside, double bside) {
        super(color);
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("triangle, area: " + this.getArea()
                + " sq. units, firstLeg: " + this.aside + " units, secondLeg: "
                + this.bside + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return aside * bside / 2;
    }
}
