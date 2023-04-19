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
    public double calculateArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void displayProperty() {
        System.out.println("Figure: right triangle, color: " + super.getColor()
                + ", size of the first leg: " + firstLeg
                + ", size of the second leg: " + secondLeg + ", area: " + calculateArea());
    }
}

