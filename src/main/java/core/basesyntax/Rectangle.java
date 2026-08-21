package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle-,")
                .append(" area: " + calculateArea() + " sq. units,")
                .append(" length: " + length + " units,")
                .append(" width: " + width + " units,")
                .append(" color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return Math.floor(length * width * 10.0) / 10.0;
    }
}
