package core.basesyntax;

public class Square extends Figure implements  AreaCalculator, Drawable {
    private int side;

    public Square(int side, Color color) {
        super(color);
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "square" + ", area: " + getArea()
                + ", side: " + getSide() + ", color: " + getColor());
    }
}
