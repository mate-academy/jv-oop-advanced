package core.basesyntax;

public class Figure implements AreaCalculator {
    public Color color;
    public String name;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
