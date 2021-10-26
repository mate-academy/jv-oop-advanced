package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.side = side;
        super.setName("square");
        super.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units"
                + ", side: " + side + " units"
                + ", color: " + this.getColor());
    }

    public double getArea() {
        return side * side;
    }
}

