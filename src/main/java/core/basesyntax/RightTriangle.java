package core.basesyntax;

public class RightTriangle extends Figures {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle" + ", "
                + "area: " + getArea() + ", "
                + "firstLeg: " + firstLeg + ", "
                + "secondLeg: " + secondLeg + ", "
                + "color: " + getColor());
    }
}
