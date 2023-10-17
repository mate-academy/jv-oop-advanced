package core.basesyntax;

public class Circle extends Figure {
    public Circle(String name, int side, String color) {
        super(name, side, color);
    }

    @Override
    public void getsSquare() {
        System.out.println("Figure: " + getName()
                + "side " + getSide()
                + " Area " + (Math.PI * getSide() * getSide())
                + " Color: " + getColor());
    }

}
