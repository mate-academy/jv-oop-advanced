package core.basesyntax;

public class Circle extends Figure implements FigureDraw, AreaCalculator {
    private double radius;
    private String name = "Circle";

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        StringBuilder circleInfo = new StringBuilder();
        circleInfo
                .append("Figure ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, radius ")
                .append(radius)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(circleInfo);
    }
}
