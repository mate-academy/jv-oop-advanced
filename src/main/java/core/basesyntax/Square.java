package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("This is square with side - "
                + this.side + " ,color - " + this.color
                + " and area - " + this.calcArea());
    }
}
