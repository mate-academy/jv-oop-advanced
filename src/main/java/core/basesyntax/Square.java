package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Name: square" + "color: "
                + getColor() + ", side: " + side + " units"
                + ", area: " + getArea() + " square units");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
