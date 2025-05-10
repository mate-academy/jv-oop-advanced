package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void getDetails() {
        System.out.println(getColor() + " " + " square with side " + side + " and area of "
                + getArea());
    }
}
