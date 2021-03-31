package core.basesyntax;

public class Triangle extends Figure implements Drawable {
    public static final int RANGE = 10;
    private double length;
    private double width;

    public Triangle() {
        this.length = Math.random() * RANGE;
        this.width = Math.random() * RANGE;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHypotenuse() {
        return Math.sqrt(length * length + width * width);
    }

    @Override
    public double getArea() {
        return length * width / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: triangle, area: " + String.format("%.1f", getArea())
                + " sq. units, hypotenuse: " + String.format("%.1f", getHypotenuse())
                + " units, color: " + getColor());
    }
}
