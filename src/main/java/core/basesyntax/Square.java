package core.basesyntax;

public class Square extends Figure {
    private int side; // ✅ Додано змінну `side`

    public Square(String color, int side) {
        super(color);
        this.side = side; // ✅ Ініціалізація змінної
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + ", color: " + getColor());

    }
}
