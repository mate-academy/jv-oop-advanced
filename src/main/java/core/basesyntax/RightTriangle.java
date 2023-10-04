package core.basesyntax;

public class RightTriangle extends Figure {

    private float firstLeg;
    private float secondLeg;

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public Figure getRandomFigureSup() {
        ColorSupplier nextColor = new ColorSupplier();
        firstLeg = getRandom().nextInt();
        secondLeg = getRandom().nextInt();
        setColor(nextColor.getRandomColor()); ;
        setArea(getArea());
        return this;
    }

    @Override
    public Figure getDefaultFigureSup() {
        firstLeg = 4;
        secondLeg = 3;
        setColor(Color.WHITE);
        setArea(getArea());
        return this;
    }

    public void setFirstLeg(float firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(float secondLeg) {
        this.secondLeg = secondLeg;
    }

    public float getFirstLeg() {
        return firstLeg;
    }

    public float getSecondLeg() {
        return secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " sq.units, firstLeg:"
                + " " + getFirstLeg() + " units, secondLeg: " + getSecondLeg() + " units, color: "
                + getColor());
    }
}
