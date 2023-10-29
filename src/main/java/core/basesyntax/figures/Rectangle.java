package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final double upperSide;
    private final double leftSide;

    public Rectangle(String color, double upperSide, double leftSide) {
        super(color);
        this.upperSide = upperSide;
        this.leftSide = leftSide;
        calcArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(area) + " sq. units");
        System.out.println("Upper Side: " + roundDouble(upperSide) + " units");
        System.out.println("Left Side: " + roundDouble(leftSide) + " units");
    }

    @Override
    public void calcArea() {
        area = upperSide * leftSide;
    }
}
