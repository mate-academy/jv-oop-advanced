package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "; " + "Area: " + calculateArea() + "; "
                + "Side: " + side + "; " + "Color: " + getColor() + ";");
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
