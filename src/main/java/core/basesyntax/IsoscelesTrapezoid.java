package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, FigureDraw {
    private double longSide;
    private double shortSide;
    private double height;
    private String name = "Isosceles Trapezoid";

    public IsoscelesTrapezoid(String color, double longSide, double shortSide, double height) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (shortSide + longSide) * height / 2;
    }

    @Override
    public void draw() {
        StringBuilder trapezoidInfo = new StringBuilder();
        trapezoidInfo
             .append("Figure: ")
             .append(name)
             .append(", area: ")
             .append(getArea())
             .append(" sq.units, long side: ")
             .append(longSide)
             .append(" units, short side: ")
             .append(shortSide)
             .append(" units, height: ")
             .append(height)
             .append(" units, color: ")
                .append(getColor());
        System.out.println(trapezoidInfo);
    }
}
