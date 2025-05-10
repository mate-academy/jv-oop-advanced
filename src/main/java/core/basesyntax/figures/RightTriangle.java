package core.basesyntax.figures;

public class RightTriangle extends Shape {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle,"
                + " area: " + calculateArea() + " sq. units,"
                + " firstLeg: " + firstLeg + " units,"
                + " secondLeg: " + secondLeg + " units,"
                + " color: " + color + "\"");
    }
}
