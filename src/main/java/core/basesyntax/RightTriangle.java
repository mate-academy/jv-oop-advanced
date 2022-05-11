package core.basesyntax;

public class RightTriangle extends Figure{
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setName("Right Triangle");
    }

    @Override
    double area() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + this.getName() + ", area: " + this.area() + " sq.units, first leg: "
                + firstLeg + " units, second leg: " + secondLeg + " units, color: " + getColor());
    }
}
