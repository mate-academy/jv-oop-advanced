package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, FigureDraw {
    private double firstLeg;
    private double height;
    private String name = "Right Triangle";

    public RightTriangle(String color, double firstLeg, double height) {
        super(color);
        this.height = height;
        this.firstLeg = firstLeg;
    }

    @Override
   public double getArea() {
        return firstLeg * height / 2;
    }

    @Override
    public void draw() {
        StringBuilder triangleidInfo = new StringBuilder();
        triangleidInfo
                .append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, first leg: ")
                .append(firstLeg)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(triangleidInfo);
    }
}
