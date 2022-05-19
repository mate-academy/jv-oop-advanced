package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    final private double height;
    final private double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("color = " + getColor() + " height = " + height + " width = " + width);
    }
}
