package core.basesyntax;

public class Square extends Figure {
    private int firstSide;

    public Square(int firstSide, Color color) {
        this.firstSide = firstSide;
        super.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * firstSide;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea() + " sq. units"
                        + ", side: " + firstSide + " units"
                        + ", color: " + color);
    }
}
