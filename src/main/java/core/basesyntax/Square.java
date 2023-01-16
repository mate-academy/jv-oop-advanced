package core.basesyntax;

public class Square extends Figure {
    int side;

    public Square(String color, String name, int side) {
        super(color, name);
        this.side = side;
    }

    public void draw() {
        int area;
        area = side*side;
        System.out.println("Figure: " + getName() + ",  area: " + area+"sq.units" + "  side: " + side+"units" + "  color: " + getColor());
    }
}
