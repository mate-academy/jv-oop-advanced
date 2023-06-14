package core.basesyntax;

public class Square extends Figure {
    private float side;

    public Square(float side, String color) {
        this.side = side;
        this.color = Color.valueOf(color);
    }

    public Square(float side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    protected float getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square has four sides of "
                + side
                + " and an area of "
                + getArea());
    }
}
