package core.basesyntax;

public abstract class Figure implements Object {

    private Color color;
    private double area;

    public Figure(Color color) {
        setColor(color);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return "I am a figure.";
    }
}
