package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color) {
        super(color);
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        int area = getArea();
        String color = getColor();

        System.out.println("Figure: square, area: " + area + " sq. , color: " + color);
    }
}
