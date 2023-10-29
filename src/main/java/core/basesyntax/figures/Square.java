package core.basesyntax.figures;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        calcArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square");
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(area) + " sq. units");
        System.out.println("Side: " + roundDouble(side) + " units");
    }

    @Override
    public void calcArea() {
        area = side * side;
    }
}
