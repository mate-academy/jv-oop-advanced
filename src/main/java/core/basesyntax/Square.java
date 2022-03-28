package core.basesyntax;

public class Square extends Figure implements Area, Draw {
    public String color;
    private int side;

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + area()
                + " sq.units, side: " + side + "units, color "
                + color);
    }
}
