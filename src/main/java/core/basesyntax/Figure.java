package core.basesyntax;

public abstract class Figure implements Drowable {
    private String color;
    private double area;

    public Figure(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

}
