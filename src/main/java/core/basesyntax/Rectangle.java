package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void toDraw() {
        System.out.println("Rectangle [Color: " + color + ", Width: "
                + width + ", Height: " + height + ", Area: " + getArea() + "]");
    }
}
