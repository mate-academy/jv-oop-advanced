package core.basesyntax;

public class Square extends Figure implements AreaCalculator, InformationPrinter {
    private double sides;

    public Square(double sides, String color) {
        super(color);
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double side) {
        this.sides = side;
    }

    public double getArea() {
        return Math.pow(sides, 2);
    }
    
    public void drawIt() {
        System.out.println("Figure - square, color - " + getColor()
                + ", area - " + getArea()
                + ", sides - " + getSides());
    }
}
