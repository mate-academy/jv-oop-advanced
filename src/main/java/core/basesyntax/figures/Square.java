package core.basesyntax.figures;

import core.basesyntax.AreaCalculation;
import core.basesyntax.Figure;

public class Square extends Figure implements AreaCalculation {

    private int side;

    public Square(String color, String name, int side) {
        super(color, name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String printInfo() {
        return super.printInfo()
                + " sides: "
                + side
                + " units";
    }
}
