package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public IsoscelesTrapezoid(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: рівнобедрена трапеція, площа: " + getArea()
                + " кв. одиниць, перша основа: " + base1 + " одиниць, друга основа: "
                + base2 + " одиниць, висота: " + height + " одиниць, колір: " + getColor());
    }
}
