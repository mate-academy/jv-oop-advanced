package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int aside;
    private int bside;
    private int heigth;

    public IsoscelesTrapezoid(int aside, int bside, int heigth, Color color) {
        this.aside = aside;
        this.bside = bside;
        this.heigth = heigth;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return ((aside + bside) / 2) * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid"
                + ", area: "
                + calculateArea()
                + " sq.units"
                + ", a side: "
                + aside
                + " units, b side: "
                + bside
                + " units, heigth: "
                + heigth
                + " units, color: "
                + getColor().name().toLowerCase());
    }
}
