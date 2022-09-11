package core.basesyntax;

public class Square extends Figure {
    private float side = getSomething();

    public float getArea() {
        return side * side;
    }

    @Override
    public String printInfo() {
        setName("square");
        System.out.println("Figure: " + getName() + ", area: "
                + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor() + "\n");
        return null;
    }
}
