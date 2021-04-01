package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color, "square");
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public String draw() {
        return super.draw() + ", side : " + getSide() + " units";
    }
}
