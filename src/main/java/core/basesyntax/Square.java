package core.basesyntax;

public class Square extends Figure {
    public Square(String name, int side, String color) {
        super(name, side, color);
    }

    @Override
    public void getsSquare() {
        System.out.println("Figure: " + getName()
                + "side " + getSide()
                + " Area " + (getSide() * getSide())
                + " Color " + getColor());
    }
}
