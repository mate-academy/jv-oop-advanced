package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color, double firstBase,
                              double secondBase, double heigth) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid" + ", area " + getArea()
                + "sq.units, first base: " + firstBase + "units, second base: " + secondBase
                + "units, height: " + height + "units, " + "color:  " + getColor());
    }
}
