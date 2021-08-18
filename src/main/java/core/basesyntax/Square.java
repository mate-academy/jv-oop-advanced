package core.basesyntax;

public class Square extends Figure implements AreaCalculator, Draw {
    private int side;

    public Square(){

    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.centimeters, side: "
                + getSide() + ", color: " + getColor());
    }
}

