package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public RightTriangle(String color, double firstSide, double secondSide) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return Math.floor(((firstSide * secondSide) / 2) * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: right triangle, area: " + getArea()
                + " sq. units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }
}
