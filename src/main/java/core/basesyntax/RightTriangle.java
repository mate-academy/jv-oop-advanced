package core.basesyntax;

public class RightTriangle extends Figure implements Area, FigureSupplier {
    float firstLeg;
    float secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        firstLeg = random.nextInt();
        secondLeg = random.nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        firstLeg = 4;
        secondLeg = 3;
        setColor(Color.WHITE);
        setArea(getArea());
        return this;
    }
}
