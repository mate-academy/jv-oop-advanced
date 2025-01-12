package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase = 0;
    private double secondBase = 0;
    private double height = 0;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        setColor(color);
        this.firstBase = base1;
        this.secondBase = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure : Isosceles Trapezoid, area : " + getArea()
                + " units, firstBase : " + firstBase + " secondBase : " + secondBase + " height : "
                + height + " units, color : " + getColor());
    }
}
