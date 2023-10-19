
package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int baseOne;
    private int baseTwo;

    public IsoscelesTrapezoid(String type, String colour, String property,
                              int h, int baseOne, int baseTwo) {
        super(type, colour, property);
        this.height = h;
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
    }

    @Override
    public double calculateArea() {
        return (double) (baseOne + baseTwo) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getType() + ", " + calculateArea() + " sq. units, height: "
                + height + " units, baseOne, baseTwo: " + baseOne + ", " + baseTwo
                + " units, color: " + getColour() + ", property: " + getProperty());
    }
}
