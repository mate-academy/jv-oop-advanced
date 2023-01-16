package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int length;

    public Rectangle(String color, String name, int side, int length) {
        super(color, name);
        this.side = side;
        this.length = length;
    }

    @Override
    public void draw() {
        int area;
        area = side * length;
        System.out.println("Figure: " + getName() + ",  area: " + area + "sq.units" + "  side: "
                + side + "units" + "  length: " + length + "units" + "  color: " + getColor());
    }
}
