package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private int firstLeg;
    private int secondLeg;


    RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    void printColor() {
        super.printColor();
    }

    @Override
    public double getArea() {
        return 1 / 2 * (firstLeg * secondLeg);
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq. units, firstLeg: " + firstLeg + " , secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
