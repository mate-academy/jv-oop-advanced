package core.basesyntax;

public class Rectangle extends Figure implements Area, FigureSupplier {

    private float sideA;
    private float sideB;

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        sideA = random.nextInt();
        sideB = random.nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        sideA = 6;
        sideB = 11;
        setColor(Color.WHITE); ;
        setArea(getArea());
        return this;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }
}
