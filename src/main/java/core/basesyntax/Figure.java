package core.basesyntax;

public class Figure implements Drawable {
    private String color;

    public Figure(String color, double area) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
    }
}
