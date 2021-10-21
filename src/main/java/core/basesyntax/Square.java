package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Info {
    private double side;

    Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
