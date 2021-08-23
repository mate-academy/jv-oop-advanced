package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, FigureDraw {
    private double longSide;
    private double shortSide;
    private String name = "Rectangle";

    public Rectangle(String color, double longSide, double shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }

    @Override
    public void draw() {
        StringBuilder rectangleInfo = new StringBuilder();
        rectangleInfo
                .append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, long side: ")
                .append(longSide)
                .append(" units, short side: ")
                .append(shortSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(rectangleInfo);
    }
}
