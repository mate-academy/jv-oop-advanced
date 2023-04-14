package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstParallel;
    private final double secondParallel;
    private final double height;

    public IsoscelesTrapezoid(
            String color, double firstParallel, double secondParallel, double height) {
        super(color);
        this.firstParallel = firstParallel;
        this.secondParallel = secondParallel;
        this.height = height;
    }

    @Override
    public String getName() {
        return "IsoscelesTrapezoid";
    }

    public double getFirstParallel() {
        return firstParallel;
    }

    public double getSecondParallel() {
        return secondParallel;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return ((firstParallel + secondParallel) / 2) * height;
    }

    @Override
  public void draw() {
        System.out.println(
                "Figure : "
                + "isosceles trapezoid,"
                + " area : "
                + getArea()
                + " sq.units "
                + ",first parallel : "
                + getFirstParallel()
                + " units,"
                + " second parallel : "
                + getSecondParallel()
                + " units,"
                + " height :"
                + getHeight()
                + ", color : "
                + getColor());
    }
}
