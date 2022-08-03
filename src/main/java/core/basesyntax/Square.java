package core.basesyntax;

public class Square extends Figures {
    private double side;
    
    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
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
