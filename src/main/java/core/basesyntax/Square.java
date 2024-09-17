package core.basesyntax;

public class Square extends Figure {
    private int firstSide;

    public Square(int firstSide, Color color) {
        super(color);
        this.firstSide = firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getFirstSide() {
        return firstSide;
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
                        + ", color: " + getColor());
    }
}
