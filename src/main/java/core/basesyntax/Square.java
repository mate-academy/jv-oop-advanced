package core.basesyntax;

public class Square extends Figure {
    private int side;
    private String color = getColor();

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double areaCalculator() {
        return (side * side);
    }

    @Override
    public void draw() {
        System.out.println("Figure square, area: " + areaCalculator()
                + ", side: " + side
                + ", color: " + color);
    }
}
