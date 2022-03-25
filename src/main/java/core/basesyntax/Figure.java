package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawing {
    private String color;

    public Figure(String colors) {
        this.color = colors;
    }

    public String getColor() {
        return color;
    }
}
