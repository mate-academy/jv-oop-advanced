package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    final private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("color = " + getColor() + " side = " + side);
    }
}
