package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int aside;
    private int bside;
    private int height;

    public IsoscelesTrapezoid(String color, String name, int aside, int bside, int height) {
        super(color, name);
        this.aside = aside;
        this.bside = bside;
        this.height = height;
    }

    public void draw() {
        int area;
        area = (aside + bside) * height / 2;
        System.out.println("Figure: " + getName() + ",  area: " + area + "sq.units" + "  aSide: "
                + aside + "units" + "  color: " + getColor());
    }
}
