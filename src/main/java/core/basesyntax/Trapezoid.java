package core.basesyntax;

public class Trapezoid implements Figure {
    private int bottomBase;
    private int topBase;
    private int height;

    public Trapezoid(int bottomBase, int topBase, int height) {
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public String drawFigure() {
        return "Shape: trapezoid, area: " + getSquare() + ", bottom base: "
                + bottomBase + ", top base: " + topBase + ", height: "
                + height + ", color: " + getColor();
    }

    @Override
    public double getSquare() {
        return (bottomBase + topBase) * height / 2.0;
    }

    @Override
    public Color getColor() {
        return new ColorProducer().insertRandomColor();
    }
}
