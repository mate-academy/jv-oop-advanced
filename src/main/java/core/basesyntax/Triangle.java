package core.basesyntax;

public class Triangle extends Figure {
    private int baseSide;
    private int height;

    protected Triangle(int baseSide,int height, Color color) {
        super(1 / 2 * baseSide * height, color);
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String displayInfo() {
        return "Figure:Triangle" + "," + "Color:" + getColor() + ","
                + "Area:" + getArea() + "," + "Height:" + height;
    }
}
