package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double legSide;
    private final double height = Math.pow(legSide, 2) - Math.pow(((downSide - topSide) / 2), 2);

    public IsoscelesTrapezoid(String color, double topSide, double downSide, double legSide) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.legSide = legSide;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + ((topSide + downSide) / 2)
                * height + " sq.units, topSide: " + topSide + " units, downSide: "
                + downSide + " units, legSide: " + legSide + " units, color: "
                + new ColorSupplier().getRandomColor();
    }

    @Override
    public double getArea() {
        return ((topSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid was drawn");
    }
}
