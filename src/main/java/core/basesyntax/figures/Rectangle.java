package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
      public double getArea() {
        return length * width;
    }

    public String getFigureInfo() {
        return " length: " + length + " width: " + width + " units,";
    }
}
