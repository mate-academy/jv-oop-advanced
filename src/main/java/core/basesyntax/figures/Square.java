package core.basesyntax.figures;

public class Square extends Shape {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
        area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square,"
                + " area: " + calculateArea() + " sq. units,"
                + " side: " + side + " units,"
                + " color: " + color + "\"");
    }
}
