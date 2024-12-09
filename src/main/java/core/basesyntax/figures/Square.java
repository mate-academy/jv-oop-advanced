package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, String name, int side) {
        super(color, name);
        this.side = side;
    }

    @Override
  public double getArea() {
        return side * side;
    }

    public String getUnitsInfo() {
        return " side: " + side + " units,";
    }
}
