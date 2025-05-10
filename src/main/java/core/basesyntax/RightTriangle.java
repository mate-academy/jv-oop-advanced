package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    public void draw() {
        System.out.println("RightTriangle: color=" + this.getColor()
                + ", firstLeg="
                + secondLeg
                + ", secondLeg="
                + getArea()
                + ", area="
                + firstLeg);
    }
}
