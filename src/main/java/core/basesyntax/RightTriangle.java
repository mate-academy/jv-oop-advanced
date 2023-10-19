package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        this.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void obtainTheArea() {
        setArea((double) (firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: "
                + firstLeg + "units, secondLeg: " + secondLeg + " units, color: "
                + getColor().toLowerCase());
    }
}
