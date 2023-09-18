package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Right Triangle | first leg length: %.2f | second leg length: %.2f |" +
                "\narea: %.2f | color: %s\n", firstLeg, secondLeg, calculateArea(), getColor());
    }
}
