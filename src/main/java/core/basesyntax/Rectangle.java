package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("length: ").append(length).append(" units, ")
                .append("width: ").append(width).append(" units, ")
                .append("color: ").append(color);
        System.out.println(stringBuilder.toString());
    }
}
