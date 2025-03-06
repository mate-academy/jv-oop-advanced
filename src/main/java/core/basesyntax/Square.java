package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + calculate()
                + " sq. units, side: " + side
                + " units , color: " + getColor());
    }

    @Override
    public double calculate() {
        return side * side;
    }

}
