package core.basesyntax;

public class RightTriangle extends Figure {
    private String color;
    private int side1;
    private int side2;

    public RightTriangle() {

    }

    public RightTriangle(String color, int side1, int side2) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ").append(calculateArea());
        builder.append(" sq.units, side1: ").append(side1).append(" sq.units, side2: ");
        builder.append(side2).append(" units, color: ").append(color);
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return (double) side1 * side2 * 0.5;
    }
}
