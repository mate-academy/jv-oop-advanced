
package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private int height;
    private int base1;
    private int base2;

    public IsoscelesTrapezoid(String type, String colour, String property,
                              int h, int base1, int base2) {
        super(type, colour, property);
        this.height = h;
        this.base1 = base1;
        this.base2 = base2;
    }

    @Override
    public double calcArea() {
        return (double) (base1 + base2) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calcArea() + " sq. units, height: "
                + height + " units, base1, base2: " + base1 + ", " + base2
                + " units, color: " + getColour() + ", property: " + getProperty());
    }
}
