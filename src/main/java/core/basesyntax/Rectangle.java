package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private final double height;
    private final double width;

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
        System.out.println("color = " +
                getColor() + " height = " +
                height + " width = " + width);
    }
}
