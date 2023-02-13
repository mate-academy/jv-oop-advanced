package core.basesyntax;

public class Square extends Figure {
    private final int size;

    public Square(int size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public double calculateArea() {
        return size * size;
    }

    @Override
    public void draw() {
        String stringBuilder = "Figure: " + "square, area: "
                + calculateArea() + " sq.units, size: "
                + size + " color: " + color;
        System.out.println(stringBuilder);
    }
}
