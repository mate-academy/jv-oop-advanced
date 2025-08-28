package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Square: "
                + "color: " + getColor()
                + ", side: " + getSide()
                + ", area: " + getArea());
    }

    @Override
    double getArea() {
        double area = side * side;
        return Math.round(area * NUMBER_FOR_ROUND) / NUMBER_FOR_ROUND;
    }
}
