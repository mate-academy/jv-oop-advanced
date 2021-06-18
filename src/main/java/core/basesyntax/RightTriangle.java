package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        this.setName("right triangle");
        this.setColor(color);
        this.side = side;
    }

    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());
    }
}
