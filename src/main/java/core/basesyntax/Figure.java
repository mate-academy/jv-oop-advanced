package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculate {
    private double side;
    private String color;

    public Figure(String color, double side) {
        this.color = color;
        this.side = side;
    }
    public Figure() {
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }
}
