package core.basesyntax;

public class Square extends Figures {

    public Square(String name, String color, double sideA) {
        super(name, color, sideA);
    }

    @Override
    public double getArea() {
        return getSideA() * getSideA();
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName() + ", area " + getArea()
                + "sq.units, firstLeg: " + getSideA() + " units, color: " + getColor());
    }
}
