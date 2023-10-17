package core.basesyntax;

public class RightTriangle extends Figure {
    public RightTriangle(String name, int sideA, int sideB, String color) {
        super(name, sideA, sideB, color);
    }

    @Override
    public void getsSquare() {
        System.out.println("Figure: "
                + getName() + " "
                + " sideA "
                + getSideA()
                + " sideB "
                + getSideB() + " "
                + ((getSideA() * getSideB()) / 2)
                + " Color "
                + getColor());
    }

}
