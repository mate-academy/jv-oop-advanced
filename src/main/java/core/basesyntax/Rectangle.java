package core.basesyntax;

public class Rectangle extends FigureWithBottomAndHeight {

    public Rectangle(String color, double bottom, double heigh) {
        super(color, bottom, heigh);
        area = getArea();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area + " sq. units, width: "
                + width + " units, height: " + height + " color: " + color.toLowerCase());
    }
}
