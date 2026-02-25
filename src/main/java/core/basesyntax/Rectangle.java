package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return this.width * this.height;
    }

    @Override
    public void draw() {
        System.out.println("This is rectangle with width - "
                + this.width + " ,height - " + this.height + " ,color - " + this.color
                + " and area - " + this.calcArea());
    }
}
