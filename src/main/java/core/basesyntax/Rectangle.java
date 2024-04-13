package core.basesyntax;

public class Rectangle extends Figure {
    private double aside;

    private double bside;

    public Rectangle(String color, double aside, double bside) {
        super.setColor(color);
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle was drawn");
    }

    @Override
    public double getArea() {
        return aside * bside;
    }

    @Override
    public String toString() {
        return super.toString() + "rectangle, area: " + this.getArea()
                + " sq. units, a: " + this.aside + " units, b: " + this.bside
                + " units, color: " + super.getColor();
    }
}
