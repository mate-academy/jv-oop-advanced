package core.basesyntax;

public abstract class Figure implements GetArea {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Colors.valueOf(color);
    }
}
