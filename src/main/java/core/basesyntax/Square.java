package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, String name, double side) {
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
