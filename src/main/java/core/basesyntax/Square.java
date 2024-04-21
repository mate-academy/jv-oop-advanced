package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    public static Square getRandomSquare() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Square(
                getRandomDimension(),
                colorSupplier.getRandomColor()
        );
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area "
                        + getArea()
                        + ", side: "
                        + side
                        + ", color: "
                        + getColor()
        );

    }

    @Override
    public double getArea() {
        return side * side;
    }
}
