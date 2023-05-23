package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLength;
    private int secondLength;

    public RightTriangle(int firstLength, int secondLength, String color) {
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return (double) (firstLength * secondLength) / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + getArea()
                        + "sq.units, firstLeg: " + firstLength
                        + " units, secondLeg: " + secondLength
                        + " units, color: " + super.getColor()
        );
    }
}
