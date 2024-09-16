package core.basesyntax;

public class Square extends Figure {
    private int firstSide;

    public Square(int firstSide, Color color) {
        this.firstSide = firstSide;
        super.color = color;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getFirstSideirstSide() {
        return firstSide;
    }

    @Override
    public double area() {
        return firstSide * firstSide;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + area() + " sq. units"
                        + ", side: " + firstSide + " units"
                        + ", color: " + color);
    }
}
