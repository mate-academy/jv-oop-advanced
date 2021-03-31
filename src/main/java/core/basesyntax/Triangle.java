package core.basesyntax;

public class Triangle extends Figure implements Drawable {
    private double length = Math.random() * 10;
    private double width = Math.random() * 10;
    private double hypotenuse = Math.sqrt(length * length + width * width);

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
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getArea() {
        return length * width / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: triangle, area: " + String.format("%.1f", getArea())
                + " sq. units, hypotenuse: " + String.format("%.1f", hypotenuse)
                + " units, color: " + getColor();
    }
}
