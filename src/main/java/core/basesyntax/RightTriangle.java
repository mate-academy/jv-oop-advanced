package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;
    private int heightTriangle;

    public RightTriangle(String color, int side, int heightTriangle) {
        this.side = side;
        this.heightTriangle = heightTriangle;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (1 / 2) * side * heightTriangle;
    }

    @Override
    public void draw() {
        System.out.println("We have the figure right triangle with side "
                + side + " with height " + heightTriangle + " with the area "
                + (1 / 2) * side * heightTriangle + " and color " + color);
    }
}
