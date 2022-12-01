package core.basesyntax;

public class RightTriangle extends Figure implements IAreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColor() + ".");
    }
}
