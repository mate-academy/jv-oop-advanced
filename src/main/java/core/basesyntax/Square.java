package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String name, double side, String color) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Name = " + getName() + " Area = " + calculateArea()
                + " Side = " + side + " Color = " + getColor();
    }
}
