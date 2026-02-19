package core.basesyntax;
public class Square extends AbstractFigure implements Figure, Drawable {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + area() +
                        " sq. units, side: " + side +
                        " units, color: " + getColor()
        );;
    }
}
