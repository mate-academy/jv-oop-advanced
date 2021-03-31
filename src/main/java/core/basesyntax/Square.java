package core.basesyntax;

public class Square extends FigureMain implements AreaMethod, Draw {

    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : "
                + getName() + ", area: "
                + getArea() + " sq.units, side : "
                + getSide() + ", color : "
                + getColor());
    }
}
