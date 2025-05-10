package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double lengthOfBaseOfRectangle;

    public Rectangle(String color, double height, double lengthOfBaseOfRectangle) {
        super(color);
        this.height = height;
        this.lengthOfBaseOfRectangle = lengthOfBaseOfRectangle;
    }

    @Override
    public double getArea() {
        return (height * lengthOfBaseOfRectangle) / 2;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, height: " + height
                + " units, length of base of rectangle: "
                + lengthOfBaseOfRectangle + " units, color: " + color);
    }
}
