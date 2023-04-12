package core.basesyntax;

public class RightTriangle extends Figure {
    private String color;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.println("RightTriangle: color=" + color
                + ", firstLeg="
                + firstLeg
                + ", secondLeg="
                + secondLeg
                + ", area="
                + getArea());
    }
}
