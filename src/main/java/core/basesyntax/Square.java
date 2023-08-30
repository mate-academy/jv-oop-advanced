package core.basesyntax;

public class Square extends FigureAbstract {
    private int side;
    private int area;

    protected Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
        this.area = getArea();
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public String drawInfo() {
        return "Figure: "
                +
                getName()
                +
                ", area: " + area
                +
                ", side: " + side
                +
                ", color: " + getColor();
    }
}
