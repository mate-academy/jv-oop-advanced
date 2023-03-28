package core.basesyntax;

public class Rectangle extends Figure {
    private int aside;
    private int bside;

    public Rectangle(int aside, int bside, String color) {
        this.aside = aside;
        this.bside = bside;
        setColor(color);
        setFigureType("reactangle");
    }

    @Override
    public void calculateArea() {
        setArea(aside * bside);
    }

    @Override
    public String toString() {
        return super.toString()
                + getFigureType()
                + ", area: "
                + getArea()
                + " sq.units"
                + ", a side: "
                + aside
                + " units, b side: "
                + bside
                + " units, color: "
                + getColor();
    }
}
