package core.basesyntax;

public abstract class Figure implements CalculateArea {
    private String color;

    public abstract void print();

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
