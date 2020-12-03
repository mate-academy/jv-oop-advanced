package core.basesyntax;

public abstract class Figure implements Drawing {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double getArea();
}
