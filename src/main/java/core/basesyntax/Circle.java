package core.basesyntax;

public class Circle extends Figures {

    public Circle(String name, String color, double sideA) {
        super(name, color, sideA);

    }

    @Override
    public double getArea() {
        return (Math.PI * getSideA() * getSideA());
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName() + ", area " + getArea()
                + "sq.units, radius: " + getSideA() + " units, color: " + getColor());
    }
}
