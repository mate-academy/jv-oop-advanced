package core.basesyntax;

public class Square extends Figure {
    private int side;

    public void square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String displayInfo() {
        return "Figure:Square" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Side:" + side;
    }

}
