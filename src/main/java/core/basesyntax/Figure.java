package core.basesyntax;

public abstract class Figure implements Figuring, Drawable {
    private Color color;
    private double area;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
