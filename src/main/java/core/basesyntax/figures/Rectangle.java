package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final double upperSide;
    private final double leftSide;

    public Rectangle(String color, double upperSide, double leftSide) {
        super(color);
        this.upperSide = upperSide;
        this.leftSide = leftSide;
    }

    @Override
    public void draw() {
        String output = "Figure: rectangle" + System.lineSeparator()
                + "Color: " + color + System.lineSeparator()
                + "Area: " + roundDouble(calcArea()) + " sq. units" + System.lineSeparator()
                + "Upper Side: " + roundDouble(upperSide) + " units" + System.lineSeparator()
                + "Left Side: " + roundDouble(leftSide) + " units";

        System.out.println(output);

    }

    @Override
    public double calcArea() {
        return upperSide * leftSide;
    }
}
