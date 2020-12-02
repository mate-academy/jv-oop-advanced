package core.basesyntax;

public abstract class Figure implements Drawable {
    private Colour colour;
    private double area;

    public Figure(Colour colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour.name();
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double parsingValue(double value) {
        return Double.parseDouble(String.format("%.2f", value));
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
