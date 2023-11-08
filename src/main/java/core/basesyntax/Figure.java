package core.basesyntax;

public abstract class Figure implements AreaCalculator, Pencil {
    private String color;

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
