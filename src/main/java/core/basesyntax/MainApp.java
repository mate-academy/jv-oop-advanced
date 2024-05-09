package core.basesyntax;

import core.basesyntax.color.ColorSuplier;
import core.basesyntax.figures.*;

public class MainApp {
    public static void main(String[] args) {
        ColorSuplier colorSuplier = new ColorSuplier();
        Figure figure = new Square(colorSuplier.getRandomColor(), 5);
        figure.draw();
        figure = new IsoscelesTrapezoid(colorSuplier.getRandomColor(),3, 5, 4);
        figure.draw();
    }
}
