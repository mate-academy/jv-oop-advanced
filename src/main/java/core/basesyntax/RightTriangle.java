package core.basesyntax;

public abstract class RightTriangle extends Figure{
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void printInfo() {
        System.out.println(" Figure: right triangle, area: " + getArea() + "sq.units, first leg: "
                + firstLeg + "units, second leg: " + secondLeg + "units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2;
    }
}
