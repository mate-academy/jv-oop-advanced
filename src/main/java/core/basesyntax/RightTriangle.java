package core.basesyntax;

public class RightTriangle extends Figure {
    private int width;
    private int height;

    public RightTriangle(int width, int height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double countHypotenuse() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public double countArea() {
        return (double) width * height / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: right triangle, area: " + countArea() + " sq. units, hypotenuse "
                + countHypotenuse() + ", color: " + getColor().name().toLowerCase();
    }
}
