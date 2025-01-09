package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg = 0;
    private double secondLeg = 0;

    public RightTriangle(String color) {
        setName("RightTriangle");
        setColor(color);
        this.firstLeg = getRandomSize();
        this.secondLeg = getRandomSize();

    }

    @Override
    public double getArea() {

        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getName() + ", area : " + getArea()
                + " units, firstLeg : " + firstLeg + " secondLeg : " + secondLeg
                + " units, color : " + getColor());
    }
}
