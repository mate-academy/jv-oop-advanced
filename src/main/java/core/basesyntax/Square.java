package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Drawable {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area - " + getArea() + ", side - "
                + side + ", color - " + getColor());
    }
}
