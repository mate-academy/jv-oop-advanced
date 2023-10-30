package core.basesyntax;

public class Figure implements InterfaceFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    void draw() {

    }
}
