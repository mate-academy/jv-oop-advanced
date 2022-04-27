package core.basesyntax;

public class RightRectangle extends Figure implements GetArea, ToDraw {
    private int firstLeg;
    private int secondLeg;

    public RightRectangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: Right Rectangle, area: " + this.getArea()
                + ", firstLeg: " + firstLeg + ", secondLeg: "
                + secondLeg + ", color: " + this.getColor());
    }
}
