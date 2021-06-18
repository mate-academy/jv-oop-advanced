package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        this.setName("square");
        this.setColor(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}
