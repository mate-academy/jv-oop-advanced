package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color) {
        super(color);
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
  public double getArea() {
        return side * side;

    }

    @Override
      public void draw() {
        System.out.println("square, area: "
                + getArea() + ", side: "
                + getSide() + ", color: " + getColor());
    }
}

