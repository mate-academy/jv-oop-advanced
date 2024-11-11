package core.basesyntax;

import core.basesyntax.model.AreaCalculator;
import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {

        System.out.print(String.format("%s. Color: %s. ", this.getClass().getSimpleName(), color));
        final int amountFigures = 6;
        final int HALF_FIGURES_COUNT = 3;
        AreaCalculator figure = new Circle();
        figure.setColor("");
        figure.getArea();
    }
}
