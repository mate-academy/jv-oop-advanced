package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double sides, String color) {
        super(color);
        this.side = sides;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }
    
    public void draw() {
        System.out.println("Figure - square, color - " + getColor()
                + ", area - " + getArea()
                + ", sides - " + side);
    }
}
