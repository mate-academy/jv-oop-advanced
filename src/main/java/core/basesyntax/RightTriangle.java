package core.basesyntax;

public class RightTriangle extends Figure {
    double firstLeg;
    double secondLeg;

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
    public void draw() {
        System.out.println("Figure name: " + name +
                ", Figure area: " + calculateArea() +
                ", Figure parameters: firstLeg=" + firstLeg + ", secondLeg=" + secondLeg +
                ", Figure color: " + color);
    }
}
