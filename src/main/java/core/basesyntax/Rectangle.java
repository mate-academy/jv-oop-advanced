package core.basesyntax;

public class Rectangle extends Figures {
    private double sideB;

    public Rectangle(String name, String color, double sideA, double sideB) {
        super(name, color, sideA);
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return getSideA() * sideB;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName() + ", area " + getArea()
                + "sq.units, firstLeg: " + getSideA() + "units, secondLeg: "
                + sideB + "units, " + "color: " + getColor());
    }
}
