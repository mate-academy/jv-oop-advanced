package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, FigureSupplier {

    private float sideA;
    private float sideB;
    private float high;

    @Override
    public double getArea() {
        return sideA + sideB * high;
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
        sideA = 8;
        sideB = 16;
        high = 10;
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

    public void setHigh(float high) {
        this.high = high;
    }

}
