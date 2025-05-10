package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
  public double getArea() {
        return side * side;
    }

    public String getFigureInfo() {
        return " side: " + side + " units,";
    }
}
