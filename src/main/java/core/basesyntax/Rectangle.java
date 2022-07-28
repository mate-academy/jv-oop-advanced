package core.basesyntax;

public class Rectangle extends Figure {
    private int lengthSide;
    private int widthSide;

    public Rectangle(int height, int widthSide,String color) {
        this.lengthSide = height;
        this.widthSide = widthSide;
        setColor(color);
    }

    public double calculateArea() {
        return lengthSide * widthSide;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: Rectangle, area: "
                + calculateArea() + " sq. units,  lengthSide: "
                + lengthSide + ", widthSide:" + widthSide
                + ", color: " + getColor());
    }
}
