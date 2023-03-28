package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int aside;
    private int bside;
    private int heigth;

    public IsoscelesTrapezoid(int aside, int bside, int heigth, String color) {
        this.aside = aside;
        this.bside = bside;
        this.heigth = heigth;
        setColor(color);
        setFigureType("isosceles trapezoid");
        calculateArea();
    }

    @Override
    public void calculateArea() {
        setArea(((aside + bside) / 2) * heigth);
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
                + " units, heigth: "
                + heigth
                + " units, color: "
                + getColor();
    }
}
