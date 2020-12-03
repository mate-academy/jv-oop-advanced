package core.basesyntax;

public class Rectangle extends Figure {
    private double area;
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;

        area = sideA * sideB;

        super.setColor(color);

    }

    @Override
    public double getArea(double area) {
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area : " + getArea(area) + " sq.units ,"
                            + " side A : " + getSideA() + " units, "
                            + " side B : " + getSideB() + " units, "
                            + "Color = " + super.getColor());
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

}
