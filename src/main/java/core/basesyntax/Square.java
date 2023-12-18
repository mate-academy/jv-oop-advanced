package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void getDescription() {
        System.out.println("Name: Square" + " side: " + getSide() + " units "
                + " area: " + getArea() + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

