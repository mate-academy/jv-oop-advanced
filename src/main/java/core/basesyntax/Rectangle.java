package core.basesyntax;

public class Rectangle extends Figure {
    private double widthRectangle;
    private double lengthRectangle;

    public Rectangle(String color, double widthRectangle, double lengthRectangle) {
        setColor(color);
        this.widthRectangle = widthRectangle;
        this.lengthRectangle = widthRectangle;

    }

    @Override
    public double getArea() {
        return widthRectangle * lengthRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Rectangle, area : " + getArea()
                + " units, widthRectangle : " + widthRectangle + " lengthRectangle : "
                + lengthRectangle + " units, color : " + getColor());
    }
}
