package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("This is square with side - "
                + this.side + " ,color - " + this.getColor()
                + " and area - " + this.calcArea());
    }
}
