package core.basesyntax;

public class Square extends Figure {
    private double side; // Длина стороны

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side; // Площадь = сторона * сторона
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}
