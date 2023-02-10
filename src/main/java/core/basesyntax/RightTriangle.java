package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String NAME = "right triangle";
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
        setName(NAME);
        calculateArea();
    }

    public RightTriangle() {
        setName(NAME);
    }

    @Override
    public void calculateArea() {
        setArea((firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, "
                + "color: " + getColor()
        );
    }
}
