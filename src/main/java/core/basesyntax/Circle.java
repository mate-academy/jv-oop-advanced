package core.basesyntax;

public class Circle extends Figure implements Area, FigureSupplier {
    public void setRadius(float radius) {
        this.radius = radius;
    }

    private float radius;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        radius = random.nextInt();
        color = nextColor.getRandomColor();
        area = getArea();
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        radius = 10;
        color = Color.WHITE;
        area = getArea();
        return this;
    }
}
