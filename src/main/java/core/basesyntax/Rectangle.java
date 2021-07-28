package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private double height;
    private double lenght;

    public Rectangle(double height, double lenght) {
        this.height = height;
        this.lenght = lenght;
    }

    @Override
    public void drow() {
        System.out.println("Figure: rectangle" + ", area: " + getArea()
                + " sq.units, height: " + height + " units, lenght: "
                + lenght + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return height * lenght;
    }
}
