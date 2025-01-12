package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Square, area : " + getArea()
                + " units, sides : " + side + " units, color : " + getColor());
    }
}
