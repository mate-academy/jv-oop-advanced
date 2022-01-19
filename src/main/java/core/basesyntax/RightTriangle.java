package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculation {
    private double firstLeg;
    private double secondLeg;

    RightTriangle(String color,double firstLeg,double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculatinonArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Right Triangle: " +
                "firstLeg = " + firstLeg +
                ", secondLeg = " + secondLeg +
                ", color = " + this.color +
                ", area = " + calculatinonArea();
    }
}
