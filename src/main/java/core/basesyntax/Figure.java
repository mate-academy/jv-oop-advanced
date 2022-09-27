package core.basesyntax;

public class Figure implements Area {
    private String color;

    private double area;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double findArea() {
        return area;
    }
}
