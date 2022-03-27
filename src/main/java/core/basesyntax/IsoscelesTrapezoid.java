package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Draw {
    private int base1;
    private int base2;
    private int trapezoidSide;

    public IsoscelesTrapezoid(String color, int base1, int base2, int trapezoidSide) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.trapezoidSide = trapezoidSide;
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 4 * Math.sqrt(4 * Math.pow(trapezoidSide, 2)
                - Math.pow(base1 - base2, 2));
    }

    @Override
    public void drawTheFigure() {
        System.out.println("Figure: isosceles trapezoid, base1 = " + base1
                + ", base2 = " + base2 + ", area = " + getArea()
                + ", color: " + getRandomColor());
    }
}
