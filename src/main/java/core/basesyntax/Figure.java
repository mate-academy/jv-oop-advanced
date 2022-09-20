package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String draw();

    @Override
    public abstract double getArea();
}
