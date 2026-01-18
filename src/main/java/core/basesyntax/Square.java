package core.basesyntax;

public class Square extends Figure implements Drowable, CalculateArea {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("This is square with side - " + this.side
                + " and color - " + this.getColor());
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }
}
