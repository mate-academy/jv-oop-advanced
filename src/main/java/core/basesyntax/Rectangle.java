package core.basesyntax;

public class Rectangle extends Figure {
    private int topSide;
    private int leftSide;

    public Rectangle(int topSide, int leftSide, String color) {
        this.topSide = topSide;
        this.leftSide = leftSide;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: rectangle, topSide "
                + topSide
                + ", leftSide: "
                + leftSide
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }
}
