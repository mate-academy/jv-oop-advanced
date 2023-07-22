package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private String color;
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(String color, int side1, int side2, int height) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, area: ").append(calculateArea());
        builder.append(side1).append(" sq.units, side1: ").append(" sq.units, side2: ");
        builder.append(side2).append(" sq.units, height: ").append(height);
        builder.append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return (double) ((side1 + side2) / 2) * height;
    }
}
