package core.basesyntax;

public class Rectangle extends Properties {
    private final int width = 6;
    private final int length = 8;

    @Override
    public double obtainArea() {
        return width * length;

    }

    @Override
    public void drawFigure() {

        System.out.println("Rectangle, area: " + obtainArea()
                + " sq.units, width: " + width
                + ", length: " + length + ", color " + getColor());

    }

}
