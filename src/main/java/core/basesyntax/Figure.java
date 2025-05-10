package core.basesyntax;

public abstract class Figure implements AreaCalculator, Printable {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color.name();
    }
}
