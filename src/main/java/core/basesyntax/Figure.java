package core.basesyntax;

public class Figure implements Drawable, Calculate {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public void draw() {
        // метод отображения информации о фигуре
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", color: " + color);
    }
}
