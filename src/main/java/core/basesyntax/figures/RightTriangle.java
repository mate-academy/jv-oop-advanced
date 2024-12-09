package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private int height;
    private int side;

    public RightTriangle(String color, String name, int height, int side) {
        super(color, name);
        this.height = height;
        this.side = side;
    }

    @Override
  public double getArea() {
        return (height * side) / 2;
    }

    public String getUnitsInfo() {
        return " height: " + height + " side: " + side + " units,";
    }
}
