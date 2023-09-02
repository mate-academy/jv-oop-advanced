package core.basesyntax;

public class Square extends FigureAbstract {
    private static Square square = new Square();
    private int side;
    private int area;

    public Square() {
    }

    protected Square(String color, int side) {
        super(color);
        this.side = side;
        area = getArea();
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                square.getClass().getSimpleName().toLowerCase()
                +
                ", area: " + area
                +
                ", side: " + side
                +
                ", color: " + getColor());
    }
}
