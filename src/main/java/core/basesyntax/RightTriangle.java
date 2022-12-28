package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawable {
    int firstLeg;
    int secondLeg;

    public RightTriangle(Colors color ,int secondLeg, int firstLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg >> 1;
    }

    @Override
    public void PrintInfo() {
        System.out.println(" Figure: right triangle, area:  " + getArea() + " sq.units, firstLeg: " + firstLeg + " ,units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}

