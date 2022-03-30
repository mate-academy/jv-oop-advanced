package core.basesyntax;

public class Rectangle extends Figure {
    private double side;

    public Rectangle(String color, String name, double side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" side: " + side + " color: " + color);
    }

    @Override
    public void area() {
        area = side * side;
    }
}
