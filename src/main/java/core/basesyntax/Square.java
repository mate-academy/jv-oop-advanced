package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(double side, double area, String color) {
        super(color, area);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("square, " + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, " + "color: " + getColor());
    }
}
