package core.basesyntax;

public class Circle extends Figure implements Area, Drawable {

    private float radius;

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public Figure getRandomFigureSup() {
        ColorSupplier nextColor = new ColorSupplier();
        radius = getRandom().nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigureSup() {
        setRadius(10);
        setColor(Color.WHITE); ;
        setArea(getArea());
        return this;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + getArea()
                + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }
}
