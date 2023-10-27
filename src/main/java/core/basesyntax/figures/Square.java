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
        super.draw();
        System.out.println("Side: " + roundDouble(side) + " units");
    }

    @Override
    public void calcArea() {
        area = side * side;
    }
}
