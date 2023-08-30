package core.basesyntax;

public class Square extends FigureAbstract {
    private int side;
    private int area;

    protected Square(String name, String color, int side) {
        super(name, color);
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
                getName()
                +
                ", area: " + area
                +
                ", side: " + side
                +
                ", color: " + getColor());
    }
}
