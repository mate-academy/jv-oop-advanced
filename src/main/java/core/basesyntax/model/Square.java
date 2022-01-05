package core.basesyntax.model;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String name = getClass().getSimpleName();
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: " + name + ", area: " + area + " eq. units, color: " + color);
    }
}
