package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle, "
                + "area: " + getArea() + " sq. units, "
                + "firstLeg: " + getFirstLeg() + " units, "
                + "secondLeg: " + getSecondLeg() + " units, "
                + "color: " + getColor());
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }
}
