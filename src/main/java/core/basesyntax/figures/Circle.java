package core.basesyntax.figures;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
  public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getFigureInfo() {
        return "radius: " + radius + " units,";
    }
}

