package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    private Color color;
    private double area;

    public Figure(double area, Color color) {
        this.area = area;
        this.color = color;
    }

    public Figure() {

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
