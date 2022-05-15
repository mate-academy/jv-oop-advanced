package core.basesyntax;

public class Figure implements Area, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
    }

    @Override
    public double getArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }
}
