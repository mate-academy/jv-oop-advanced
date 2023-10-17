package core.basesyntax;

public class Rectangle extends Figure {
    public Rectangle(String name, int sideA, int sideB, String color) {
        super(name,sideA, sideB, color);
    }

    @Override
    public void getsSquare() {
        System.out.println("Figure: "
                + getName() + " side "
                + getSideA() + " sideB "
                + getSideB() + " Area "
                + (getSideA() * getSideB())
                + " Color " + getColor());
    }
}
