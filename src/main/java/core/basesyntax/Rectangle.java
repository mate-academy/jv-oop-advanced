package core.basesyntax;

public class Rectangle extends Figure {
    private int lengthSide;
    private int widthSide;

    public Rectangle(int height, int widthSide,String color) {
        super(color);
        this.lengthSide = height;
        this.widthSide = widthSide;
    }

    public double calculateArea() {
        return lengthSide * widthSide;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: Rectangle, area: "
                + calculateArea() + " sq. units,  lengthSide: "
                + lengthSide + ", widthSide:" + widthSide
                + ", color: " + getColor());
    }
}
