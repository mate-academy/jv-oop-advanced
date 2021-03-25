package core.basesyntax.model.state;

import core.basesyntax.Figure;
import core.basesyntax.model.figures.Circle;
import core.basesyntax.model.figures.IsoscelesTrapezoid;
import core.basesyntax.model.figures.Rectangle;
import core.basesyntax.model.figures.RightTriangle;
import core.basesyntax.model.figures.Square;

/**
 * Класс должен возвращать случайный объект Figure.
 * Создать массив существующих фигур.
 * Создать метод, который вернет случайный объект Figure.
 */

public class FigureSupplier {

    private static final Figure[] FIGURES = new Figure[]{
            new Circle(), new Rectangle(), new Square(),
            new RightTriangle(), new IsoscelesTrapezoid()
    };

    /**
     * Вернуть случайный объект Figure.
     */

    public static Figure generateFigure() {
        return FIGURES[(int)(Math.random() * FIGURES.length)].getFigure();
    }
}
