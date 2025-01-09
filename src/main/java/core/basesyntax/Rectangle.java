package core.basesyntax;

public class Rectangle extends Figure {
    private double widthRectangle = 0;
    private double lengthRectangle = 0;

    public Rectangle(String color) {
        setName("Rectangle");
        setColor(color);
        this.widthRectangle = getRandomSize();
        this.lengthRectangle = getRandomSize();

    }

    @Override
    public double getArea() {
        return widthRectangle * lengthRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, widthRectangle : " + widthRectangle + " lengthRectangle : "
                + lengthRectangle + " units, color : " + getColor());
    }
}
