package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.floor(side * side * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }
}
