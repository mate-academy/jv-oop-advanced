package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double base1;
    private double base2;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(double base1, double base2, double side, String color) {
        this.side = side;
        this.base1 = base1;
        this.base2 = base2;
        setColor(color);
        setFigureName("isosceles trapezoid");
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 4) * Math.sqrt((4 * (side * side))
                - ((base1 - base2) * (base1 - base2)));
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", bottom base: " + base1 + ", top base: " + base2
                + ", side: " + side + " units, color: " + getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new IsoscelesTrapezoid((int)(Math.random() * 100), (int)(Math.random() * 100),
                                     (int)(Math.random() * 100), ColorSupplier.randomColor());
    }
}
