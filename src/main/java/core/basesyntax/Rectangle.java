package core.basesyntax;

public class Rectangle extends Figure {
    private double height;
    private double lenght;

    public Rectangle(double height, double lenght, String color) {
        super(color);
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle" + ", area: " + getArea()
                + " sq.units, height: " + height + " units, lenght: "
                + lenght + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return height * lenght;
    }
}
