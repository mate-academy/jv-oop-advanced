package core.basesyntax;

public abstract class Figure implements AreaCalculation {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();

    @Override
    public double calculatinonArea() {
        return 0;
    }
}
