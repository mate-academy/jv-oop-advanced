package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle: "
                + "color: " + getColor()
                + ", first leg: " + getFirstLeg()
                + ", second leg: " + getSecondLeg()
                + ", area: " + getArea());
    }

    @Override
    double getArea() {
        double area = 0.5 * firstLeg * secondLeg;
        return Math.round(area * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }
}
