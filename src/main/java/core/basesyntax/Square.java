package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "; " + "Area: " + calculateArea() + "; " + "Side: " + side + "; " + "Color: " + color + ";");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
