package core.basesyntax;

public abstract class Figure implements Shape {
    protected String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
}
