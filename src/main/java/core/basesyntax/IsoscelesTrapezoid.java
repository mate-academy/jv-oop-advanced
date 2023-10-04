package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, FigureSupplier {
    float sideA;
    float sideB;
    float high;

    @Override
    public double getArea() {
        return sideA + sideB * high;
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        sideA = random.nextInt();
        sideB = random.nextInt();
        color = nextColor.getRandomColor();
        area = getArea();
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        sideA = 8;
        sideB = 16;
        high = 10;
        color = Color.WHITE;
        area = getArea();
        return this;
    }
}
