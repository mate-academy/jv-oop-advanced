package core.basesyntax;

public class Square extends Figure implements Area, FigureSupplier {
    private float sideLength;

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        sideLength = random.nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        sideLength = 5;
        setColor(Color.GREEN); ;
        setArea(getArea());
        return this;
    }
}
