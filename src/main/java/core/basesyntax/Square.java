package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
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
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void printInfo() {
        System.out.println(getColor() + " square with side: " + getSide()
                + " and area: " + getArea() + " Слава Україні!");
    }
}
