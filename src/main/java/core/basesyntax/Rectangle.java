package core.basesyntax;

public class Rectangle extends Figure {
    private int aside;
    private int bside;

    public Rectangle(int aside, int bside, Color color) {
        this.aside = aside;
        this.bside = bside;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return aside * bside;
    }

    @Override
    public void draw() {
        System.out.println("Figure: reactangle"
                + ", area: "
                + calculateArea()
                + " sq.units"
                + ", a side: "
                + aside
                + " units, b side: "
                + bside
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
