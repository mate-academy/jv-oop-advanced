package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, String name, int length, int width) {
        super(color, name = "Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
      public double getArea() {
        return length * width;
    }

    public String getUnitsInfo() {
        return " length: " + length + " width: " + width + " units,";
    }
}
