package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        String output = "Figure: square" + System.lineSeparator()
                + "Color: " + color + System.lineSeparator()
                + "Area: " + roundDouble(calcArea()) + " sq. units" + System.lineSeparator()
                + "Side: " + roundDouble(side) + " units";

        System.out.println(output);
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
