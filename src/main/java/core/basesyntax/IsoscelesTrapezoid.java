package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, Color color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * height / 2;
    }

    @Override
    public void draw() {
        double area = getArea();
        System.out.println(new StringBuilder()
                .append("Figure: isosceles trapezoid, ")
                .append("area: ").append(area).append(" sq. units, ")
                .append("first base: ").append(firstBase).append(" units, ")
                .append("second base: ").append(secondBase).append(" units, ")
                .append("height: ").append(height).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
