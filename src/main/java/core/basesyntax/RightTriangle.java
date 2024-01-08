package core.basesyntax;

public class RightTriangle extends Figures {
    private int firstBases;
    private int secondBases;

    public RightTriangle(String color, int firstBases, int secondBases) {
        super(color);
        this.firstBases = firstBases;
        this.secondBases = secondBases;
    }

    @Override
    public double getArea() {
        return (firstBases * secondBases) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle, area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstBases + " units, "
                + "secondLeg: " + secondBases + " units, "
                + "color: " + getColor());
    }
}
