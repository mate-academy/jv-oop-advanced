package core.basesyntax;

public class Figure implements FigureInfo {
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {
    }
}
