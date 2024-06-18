package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + calculateArea() + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw(Figure figure) {
        System.out.println(figure);
    }
}
