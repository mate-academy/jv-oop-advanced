package core.basesyntax.figures;

public abstract class Figure implements Drawable {
    protected String color;
    protected double area;

    protected Figure(String color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract void calcArea();

    public String roundDouble(double num) {
        // Prints out only 2 digits after point for doubles
        return String.format("%.2f", num);
    }
}
