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
    public double getArea() {
        return area;
    }

    @Override
    void draw() {
        System.out.println("Square was drew");
    }

    @Override
    public Color getColor() {
        return ColorProducer.getColor();
    }

    @Override
    public String displayInfo() {
        return "Figure:Square" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Side:" + getSide();
    }

}
