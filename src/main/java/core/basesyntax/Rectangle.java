package core.basesyntax;

public class Rectangle extends Figure {
    private double sideLength1;
    private double sideLength2;

    public Rectangle(double sideLength1, double sideLength2, Color color) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("side1: ").append(sideLength1).append(" units, ")
                .append("side2: ").append(sideLength2).append(" units, ")
                .append("color: ").append(getColor().name().toLowerCase());
        System.out.println(stringBuilder);
    }

    @Override
    public double getArea() {
        return sideLength1 * sideLength2;
    }
}
