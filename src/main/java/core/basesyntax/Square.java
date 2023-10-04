package core.basesyntax;

public class Square extends Figure {

    private float sideLength;

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public Figure getRandomFigureSup() {
        ColorSupplier nextColor = new ColorSupplier();
        sideLength = getRandom().nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigureSup() {
        sideLength = 5;
        setColor(Color.GREEN); ;
        setArea(getArea());
        return this;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public float getSideLength() {
        return sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " sq.units, side:"
                + " " + getSideLength() + " units, color: " + getColor());
    }
}
