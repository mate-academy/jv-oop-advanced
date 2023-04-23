package core.basesyntax;

public class Figure implements Figureable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public void draw() {
    }
}
