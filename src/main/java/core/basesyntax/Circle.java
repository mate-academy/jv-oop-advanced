package core.basesyntax;

public class Circle extends Figure implements Area, FigureSupplier {

    private float radius;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier nextColor = new ColorSupplier();
        radius = random.nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigure() {
        radius = 10;
        setColor(Color.WHITE); ;
        setArea(getArea());
        return this;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

}
