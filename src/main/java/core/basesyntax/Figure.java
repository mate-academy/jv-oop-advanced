package core.basesyntax;

public abstract class Figure implements AreaCalculator, ToDraw {
    private String color;

    public Figure(Color color) {
        this.color = String.valueOf(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
