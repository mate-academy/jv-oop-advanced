package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, ")
                .append("area: ")
                .append(getArea())
                .append(" sq.units, ")
                .append("width: ")
                .append(width)
                .append(" units, ")
                .append("length: ")
                .append(length)
                .append(" units, ")
                .append("color: ")
                .append(getColor().name().toLowerCase());
        String stringToPrint = stringBuilder.toString();

        System.out.println(stringToPrint);
    }
}
