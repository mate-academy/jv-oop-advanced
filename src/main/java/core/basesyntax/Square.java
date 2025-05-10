package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Square:    area = %.2f sq. units, side = %.2f units, color = %s%n",
                this.area, this.side, this.color);
    }
}
