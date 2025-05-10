package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public RightTriangle(double firstSide, double secondSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void setFirstSide(double firstSide) {
        if (firstSide <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
            this.firstSide = firstSide;
        }
    }

    public void setSecondSide(double secondSide) {
        if (secondSide <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
            this.secondSide = secondSide;
        }
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea() + " sq. units"
                        + ", first side: " + firstSide + " units"
                        + ", second side: " + secondSide + " units"
                        + ", color: " + getColor());
    }
}
