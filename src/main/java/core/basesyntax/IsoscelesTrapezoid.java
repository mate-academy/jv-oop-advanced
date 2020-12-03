package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int widthUp;
    private int widthDown;
    private int height;

    public IsoscelesTrapezoid(int widthUp, int widthDown, int height, Color color) {
        super(color);
        this.widthUp = widthUp;
        this.widthDown = widthDown;
        this.height = height;
    }

    public int getWidthUp() {
        return widthUp;
    }

    public void setWidthUp(int widthUp) {
        this.widthUp = widthUp;
    }

    public int getWidthDown() {
        return widthDown;
    }

    public void setWidthDown(int widthDown) {
        this.widthDown = widthDown;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int showHeight() {
        return height;
    }

    @Override
    public double countArea() {
        return (double) (widthUp * widthDown) / 2 * height;
    }

    @Override
    public String drawFigure() {
        return "Figure: circle, area: " + countArea() + " sq. units, height "
                + showHeight() + ", color: " + getColor().name().toLowerCase();
    }
}
