package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String DEFAULT_DRAW_MESSAGE =
            "Figure: %s, area: %s sq.units, top: %s units, "
                    + "bottom: %s units, height: %s units, color: %s";
    private int topLength;
    private int bottomLength;
    private int height;

    public IsoscelesTrapezoid(int topLength, int bottomLength, int height, Color color) {
        setFigure(FigureType.ISOSCELES_TRAPEZOID);
        setTopLength(topLength);
        setBottomLength(bottomLength);
        setHeight(height);
        setColor(color);
    }

    public IsoscelesTrapezoid() {
        setFigure(FigureType.ISOSCELES_TRAPEZOID);
        setTopLength(2);
        setBottomLength(2);
        setHeight(2);
        setColor(Color.BLUE);
    }

    @Override
    public double getCalculatedArea() {
        return ((bottomLength * topLength) * height) / 2.0;
    }

    @Override
    public void drawDetails() {
        System.out.println(
                String.format(
                        DEFAULT_DRAW_MESSAGE,
                        getFigure().toLowerCase(),
                        getArea(),
                        getTopLength(),
                        getBottomLength(),
                        getHeight(),
                        getColor().toString().toLowerCase())
        );
    }

    public void setBottomLength(int bottomLength) {
        this.bottomLength = bottomLength;
    }

    public void setTopLength(int topLength) {
        this.topLength = topLength;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBottomLength() {
        return bottomLength;
    }

    public int getTopLength() {
        return topLength;
    }

    public int getHeight() {
        return height;
    }
}
