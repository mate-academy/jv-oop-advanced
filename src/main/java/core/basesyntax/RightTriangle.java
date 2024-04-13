package core.basesyntax;

public class RightTriangle extends Figure {
    private double aside;

    private double bside;

    public RightTriangle(String color, double aside, double bside) {
        super.setColor(color);
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle was drawn");
    }

    @Override
    public double getArea() {
        return aside * bside / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "triangle, area: " + this.getArea()
                + " sq. units, firstLeg: " + this.aside + " units, secondLeg: "
                + this.bside + " units, color: " + super.getColor();
    }

}
