package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String firstPart = "Figure: square, area: " + calculateArea() + " sq. units, side: ";
        String secondPart = side + " unists, color: " + getColor();
        System.out.println(firstPart + secondPart);
    }
}
