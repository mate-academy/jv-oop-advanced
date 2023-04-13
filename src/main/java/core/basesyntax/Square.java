package core.basesyntax;

public class Square extends Figure {
    private final String color;
    private final int side;

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
  public double getArea() {
        return side * side;
    }

    @Override
  public void draw() {
        System.out.println(
                "Figure : "
                + "square,"
                + " area : "
                + getArea()
                + " sq.units,"
                + " side : "
                + getSide()
                + " units,"
                + " color : "
                + getColor());
    }
}
