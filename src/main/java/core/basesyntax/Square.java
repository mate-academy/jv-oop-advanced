package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square area = " + getArea() + ", color: "
                + color.name() + ", side: " + side);
    }
}
