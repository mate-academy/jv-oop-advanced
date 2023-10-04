package core.basesyntax;

public class Rectangle extends Figure implements Area, FigureSupplier {
    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

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
