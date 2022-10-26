package core.basesyntax;

public class Square extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getName() {
        return "square";
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + colorSupplier.getRandomColor().toLowerCase());
    }
}
