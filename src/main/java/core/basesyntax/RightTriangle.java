package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    RightTriangle(){
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " +
                            getArea() + " sq.units, first leg: " +
                            firstLeg + " units, second leg: " +
                            secondLeg + " units, color: " +
                            color);
    }
}
