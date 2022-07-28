package core.basesyntax;

public class Rectangle extends Figure {
    int lengthSide;
    int widthSide;

    public Rectangle(int height, int widthSide,String color) {
        this.lengthSide = height;
        this.widthSide = widthSide;
        super.setColor(color);
        setArea(calculateArea());
    }

    public double calculateArea() {
        return lengthSide * widthSide;
    }
    @Override
    public void getPrintInfo() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq. units,  lengthSide: "+ lengthSide + ", widthSide:" + widthSide + ", color: " + getColor());
    }
}
