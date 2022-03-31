package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, String name, double topSide,
                              double bottomSide, double height) {
        super(color, name);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + calculateArea() + " topSide: " + topSide
                + " bottomSide: " + bottomSide + " height: " + height + " color: " + color);
    }

    @Override
    public double calculateArea() {
        return (topSide + bottomSide) / 2 * height;
    }
}
