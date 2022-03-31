package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class RightTriangle extends Figure {
    private final Random random = new Random();
    private static final String NAME_DEFAULT = "RIGHT_TRIANGLE";
    private int side;

    public RightTriangle(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }
/*
    public void randomRightTriangle() {
        setName(NAME_DEFAULT);
        setColor(new ColorSupplier().getRandomColor());
        this.side = random.nextInt();
    }
*/
    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + NAME_DEFAULT + ", Color: " + getColor() + ", Side: " + side + ", Area: " + getArea() + ".");
    }
}
