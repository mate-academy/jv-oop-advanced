package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public void draw() {
        System.out.println("Drawing a figure with color: " + color);
    }
}
