package core.basesyntax;

public class RightTriangle extends Figures {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color, "RightTriangle");
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) * 0.5;
    }

    public int getSideA() {
        return firstLeg;
    }

    public int getSideB() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, sideA: "
                + firstLeg + ", sideB:" + secondLeg + ", color: " + getColor());
    }
}
