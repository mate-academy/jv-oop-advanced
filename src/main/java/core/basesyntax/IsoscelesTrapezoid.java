package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area, Drawable {

    private float sideA;
    private float sideB;
    private float high;

    @Override
    public double getArea() {
        return sideA + sideB * high;
    }

    @Override
    public Figure getRandomFigureSup() {
        sideA = getRandom().nextInt();
        sideB = getRandom().nextInt();
        high = getRandom().nextInt();
        ColorSupplier nextColor = new ColorSupplier();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigureSup() {
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

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public float getHigh() {
        return high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " sq.units, sideA: "
                + getSideA() + " units, secondLeg: " + getSideB() + " units, high: " + getHigh()
                + " color: " + getColor());
    }
}
