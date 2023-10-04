package core.basesyntax;

public class Square extends Figure implements Area, FigureSupplier {
    float sideLength;

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        sideLength = random.nextInt();
        color = nextColor.getRandomColor();
        area = getArea();
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        sideLength = 5;
        color = Color.GREEN;
        area = getArea();
        return this;
    }
}
