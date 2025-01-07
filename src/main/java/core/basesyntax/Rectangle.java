package core.basesyntax;

public class Rectangle extends Figure {
    private double widthRectangle = 0;
    private double lengthRectangle = 0;

    public Rectangle(String color, double widthRectangle, double lengthRectangle) {
        super.setName("Rectangle");
        super.setColor(color);
        this.widthRectangle = widthRectangle;
        this.lengthRectangle = lengthRectangle;

    }

    @Override
    public double getArea() {
        return widthRectangle * lengthRectangle;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, widthRectangle : " + widthRectangle + " lengthRectangle : "
                + lengthRectangle + " units, color : " + getColor());
    }
}
