package core.basesyntax.figures;

// (side) × (side)
public class Square extends Figure {
    private double side;

    public Square(String name, double side, String color) {
        this.setName(name);
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
