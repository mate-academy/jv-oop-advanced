package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg; // Первый катет
    private double secondLeg; // Второй катет

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2; // Площадь = (первый катет * второй катет) / 2
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, area: " + getArea() + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}