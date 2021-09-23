package core.basesyntax;

public class Triangle extends Figure implements Drawable, AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public Triangle() {
        this.firstLeg = 1 + Math.random() * 15;
        this.secondLeg = 1 + Math.random() * 15;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + String.format("%.2f",getArea())
                + " sq.units, firstLeg: "
                + String.format("%.2f",getFirstLeg()) + " units, firstLeg: "
                + String.format("%.2f",getSecondLeg())
                + " units, color: " + getColor());
    }
}
