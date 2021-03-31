package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int length) {
        super("square", color);
        this.side = length;
    }

    @Override
    public double getArea() {
        double area = (double) side * side;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + color + ".");
    }
}
