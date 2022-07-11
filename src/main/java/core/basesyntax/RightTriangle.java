package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.setFirstLeg(firstLeg);
        this.setSecondLeg(secondLeg);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (double)(firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + RightTriangle.class.getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg() + " units, color: " + getColor());
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }
}
