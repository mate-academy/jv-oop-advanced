package core.basesyntax;

public class Square extends Figure {
    private float side;

    public Square(String color) {
        super(color);
    }

    public Square(String color, float side) {
        super(color);
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    @Override
    public float getArea() {
        return getSide() * getSide();
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing "
                + getColor()
                + " square with side equals "
                + getSide()
                + " area equals "
                + getArea());
    }
}
