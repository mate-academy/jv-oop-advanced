package core.basesyntax;

public class Rectangle extends Figure implements Area, FigureSupplier {
    float sideA;
    float sideB;

    @Override
    public double getArea() {
        return sideA * sideB;
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
        sideA = 6;
        sideB = 11;
        color = Color.WHITE;
        area = getArea();
        return this;
    }
}
