package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append("rectangle, area: ")
                .append(getArea()).append(" sq.units, ")
                .append("width: ").append(width).append(" height: ")
                .append(height).append(" color: ").append(getColor());
        System.out.println(builder.toString());
    }
}
