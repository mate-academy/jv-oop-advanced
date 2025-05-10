package core.basesyntax;

public class Square extends Figures {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName() + " is " + getColor().toLowerCase()
                + " and has area: " + getArea() + " sq. units, because has side: "
                + getSide());
    }
}
