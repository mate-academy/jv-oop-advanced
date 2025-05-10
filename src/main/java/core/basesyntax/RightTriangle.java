package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: rightTriangle, firstLeg: "
                + firstLeg
                + ", secondLeg: "
                + secondLeg
                + ", area: "
                + this.calculateArea()
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }

    public double calculateArea() {
        double result = firstLeg * secondLeg / 2;
        return Math.ceil(result);
    }
}
