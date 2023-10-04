package core.basesyntax;

public class Rectangle extends Figure implements Area, Drawable {

    private float sideA;
    private float sideB;

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public Figure getRandomFigureSup() {
        ColorSupplier nextColor = new ColorSupplier();
        setSideA(getRandom().nextInt());
        setSideB(getRandom().nextInt());
        setColor(nextColor.getRandomColor());
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigureSup() {
        setSideA(6);
        setSideB(11);
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

    public float getSideA() {
        return sideA;
    }

    public float getSideB() {
        return sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " sq.units, sideA: "
                + getSideA() + " units, sideB: " + getSideB() + " units, color: " + getColor());
    }
}
