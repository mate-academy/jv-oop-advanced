package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downSide;
    private double legSide;

    public IsoscelesTrapezoid(String color, double topSide, double downSide, double legSide) {
        super(color);
        this.topSide = topSide;
        this.downSide = downSide;
        this.legSide = legSide;
    }

    @Override
    public double getArea() {
        double height = Math.pow(legSide, 2) - Math.pow(((downSide - topSide) / 2), 2);
        return ((topSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        String randomColor = new ColorSupplier().getRandomColor();
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topSide: " + topSide + " units, downSide: "
                + downSide + " units, legSide: " + legSide + " units, color: "
                + randomColor);
    }
}
