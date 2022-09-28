package core.basesyntax;

public abstract class Figure implements Area, Drawable {
    private String color;
    private double area;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

}
