package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    private int firstLeg;
    private int secondLeg;
    private String colour;

    public RightTriangle(int firstLeg, int secondLeg, String colour) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColour(colour);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: righttriangle, " + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, " + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColour());
    }
}
