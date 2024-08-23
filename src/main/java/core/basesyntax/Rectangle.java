package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculable {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:" + area() + "sq. units, side: "
                + sideA + " side: " + sideB
                + " color: " + getColor());
    }
}
