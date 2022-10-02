package core.basesyntax;

public class Square extends Figure implements FigureInterface {
    private int side;

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    public int getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, "
                + "area: " + area() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor());
    }
}
