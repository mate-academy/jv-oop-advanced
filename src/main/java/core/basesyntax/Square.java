package core.basesyntax;

public class Square extends Figure {
    private final int size;

    public Square(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: ");
        stringBuilder.append("square, area: ")
                .append(getArea())
                .append(" sq.units, size: ")
                .append(size)
                .append(" color: ").append(color);
        System.out.println(stringBuilder);
    }
}
