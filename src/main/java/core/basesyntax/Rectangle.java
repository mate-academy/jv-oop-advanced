package core.basesyntax;

public class Rectangle extends Figure {
    private static final String DEFAULT_DRAW_MESSAGE =
            "Figure: %s, area: %s sq.units, width: %s units, length: %s units, color: %s";
    private int width;
    private int length;

    public Rectangle(int width, int length, Color color) {
        setFigure(FigureType.RECTANGLE);
        setWidth(width);
        setLength(length);
        double area = getCalculatedArea();
        setArea(area);
        setColor(color);
    }

    public Rectangle() {
        setFigure(FigureType.RECTANGLE);
        setWidth(2);
        setLength(2);
        double area = getCalculatedArea();
        setArea(area);
        setColor(Color.BLUE);
    }

    @Override
    public double getCalculatedArea() {
        return width * length;
    }

    @Override
    public void drawDetails() {
        System.out.println(
                String.format(
                        DEFAULT_DRAW_MESSAGE,
                        getFigure().toLowerCase(),
                        getArea(),
                        getWidth(),
                        getLength(),
                        getColor().toString().toLowerCase())
        );
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
