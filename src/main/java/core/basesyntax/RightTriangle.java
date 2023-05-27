package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String name = "right triangle";
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + getColor().toLowerCase());
    }
}
