package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double height;
    private double side;

    public RightTriangle(String color, int height, int side) {
        super(color);
        this.height = height;
        this.side = side;
    }

    @Override
  public double getArea() {
        return (height * side) / 2;
    }

    public String getFigureInfo() {
        return " height: " + height + " side: " + side + " units,";
    }
}
