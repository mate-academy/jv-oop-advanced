package core.basesyntax;

public class RightTriangle extends Color implements Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super.setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Type: circle, color: "
                + getColor()
                + ", area: "
                + getArea()
                + ", first leg: "
                + firstLeg
                + ", second leg: "
                + secondLeg);
    }
}
