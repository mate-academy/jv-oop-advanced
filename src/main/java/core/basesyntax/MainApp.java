package core.basesyntax;

import core.basesyntax.color.ColorSuplier;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.Square;

public class MainApp {
    public static void main(String[] args) {
        ColorSuplier colorSuplier = new ColorSuplier();
        Figure figure = new Square(colorSuplier.getRandomColor(), 5);
        figure.draw();
        figure = new Rectangle( colorSuplier.getRandomColor(), 3, 4);
        figure.draw();
    }
}
