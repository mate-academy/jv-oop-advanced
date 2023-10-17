package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    public IsoscelesTrapezoid(String name, int sideA, int sideB, int height, String color) {
        super(name, sideA, sideB, height, color);
    }

    @Override
    public void getsSquare() {
        System.out.println("Figure: " + getName()
                + " sideA " + getSideA()
                + " sideB " + getSideB()
                + " height " + getHeight()
                + " Area "
                + (((getSideA() + getSideB()) * 0.5) * getHeight())
                + " Color " + getColor());
    }
}
