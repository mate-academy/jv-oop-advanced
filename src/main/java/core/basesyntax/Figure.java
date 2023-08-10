package core.basesyntax;

public class Figure implements FigureArea, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {

    }

    @Override
    public double getArea() {
        return 0;
    }
}
