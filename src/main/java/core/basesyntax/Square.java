package core.basesyntax;

public class Square extends Figure {
    private int width;

    public Square(int width, Color color) {
        super(color);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int showWidth() {
        return width;
    }

    @Override
    public double countArea() {
        return width * width;
    }

    @Override
    public String drawFigure() {
        return "Figure: square, area: " + countArea() + " sq. units, width "
                + showWidth() + ", color: " + getColor().name().toLowerCase();
    }
}
