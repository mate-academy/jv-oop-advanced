package core.basesyntax;

public class Rectangle implements Figure {
    private int sideLength;
    private int sideWidth;

    public Rectangle(int sideLength, int sideWidth) {
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    @Override
    public String drawFigure() {
        return "Shape: rectangle, area: " + getSquare() + ", side length: "
                + sideLength + ", side width: " + sideWidth + ", color: " + getColor();
    }

    @Override
    public double getSquare() {
        return sideLength * sideWidth;
    }

    @Override
    public Color getColor() {
        return new ColorProducer().insertRandomColor();
    }
}
