package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double aside;
    private double bside;

    public Rectangle(String color, double aside, double bside) {
        super(color);
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("rectangle, area: " + this.getArea()
                + " sq. units, a: " + this.aside + " units, b: " + this.bside
                + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return aside * bside;
    }
}
