package core.basesyntax;

public class Square extends Figure {
    private int side;

    protected Square(int side, Color color) {
        super(side * side, color);
        this.side = side;
    }

    private int getSide() {
        return side;
    }

    @Override
    public String draw() {
        return "Figure:Square" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Side:" + getSide();
    }

}
