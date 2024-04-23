package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color,int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return (int) (0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, area: " + getArea() + " sg. units, firstLeg: "
                + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
