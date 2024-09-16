package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(int firstSide, int secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.color = color;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    @Override
    public double area() {
        return (firstSide * secondSide / 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + area() + " sq. units"
                        + ", first side: " + firstSide + " units"
                        + ", second side: " + firstSide + " units"
                        + ", color: " + color);
    }
}
