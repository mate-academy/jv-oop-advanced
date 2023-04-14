package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getName() {
        return "Square";
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
