package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: трикутник, площа: " + getArea() + " кв. одиниць, перша нога: " + firstLeg + " одиниць, друга нога: " + secondLeg + " одиниць, колір: " + getColor());
    }
}
