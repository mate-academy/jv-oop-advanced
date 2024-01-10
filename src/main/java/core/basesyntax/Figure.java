package core.basesyntax;

public class Figure implements Draw, Area {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
