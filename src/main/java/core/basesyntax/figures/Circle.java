package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
  public double getArea() {
        return 3.14 * radius * radius;
    }

    public String getUnitsInfo() {
        return "radius: " + radius + " units,";
    }
}

