package core.basesyntax;

public abstract class RightTriangle extends AbstractFigure implements Drawable, AreaCalculator {
    private final double legRight;
    private final double legLeft;

    public RightTriangle(double legRight, double legLeft, Color color) {
        super(color);
        this.legRight = legRight;
        this.legLeft = legLeft;
    }

    @Override
    public double getArea() {
        return 0.5 * legRight * legLeft;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем: прямоугольный треугольник, площадь: "
                + getArea() + " кв. ед., правая нога: " + legRight + " ед.,"
                + " левая нога: " + legLeft + " ед., цвет: "
                + color);
    }

    public abstract Color getColor();
}
