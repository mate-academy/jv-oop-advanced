package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        this.setColor(color);
        this.setName(Figures.SQUARE.name());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName().toLowerCase()
                + ", color: " + getColor().toLowerCase() + ", area: "
                + String.format("%.2f", getArea()) + ", side: "
                + side + " units");
    }
}
