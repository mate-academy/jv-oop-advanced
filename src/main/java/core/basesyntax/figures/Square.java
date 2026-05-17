package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Print;

public class Square extends Figure implements  AreaCalculator {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }


    @Override
    public void print() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + calculateArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor());
    }

}
