package core.basesyntax;

public class Rectangle extends Color {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getDraw() {
        return "This is Rectangle. I have Area: " + getArea() + "; width: " + width + "; height: "
                + height + "; and have color: " + getColor();
    }
}
