package core.basesyntax;

public class Rectangle extends Figure {
    private int aside;
    private int bside;

    public Rectangle(int aside, int bside) {
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public double getSquare() {
        return aside * bside;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: rectangle, area: " + getSquare()
                + " sq.units , side a: " + aside + " units, side b: "
                + bside + " units, color: " + getColor());

    }
}
