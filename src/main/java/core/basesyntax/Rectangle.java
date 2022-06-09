package core.basesyntax;

public class Rectangle extends Figure {
    private int aside;
    private int bside;
    private String color = String.valueOf(ColorSupplier.getRandomColor());

    public Rectangle(int aside, int bside) {
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public double getArea() {
        return aside * bside;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units , side a: " + aside + " units, side b: "
                + bside + " units, color: " + color);

    }
}
