package core.basesyntax;

public class Square extends Figure implements IAreaCalculator {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor() + ".");
    }
}
