package core.basesyntax.model.behavior;

import core.basesyntax.Figure;

/**
 * Реализовать поведение фигуры.
 * Вывести информацию о ее характеристиках.
 * Рассчитать ее площадь.
 * Получить объект фигуры.
 */

public interface Shape {

    /**
     * Вывести информацию о фигуре.
     */

    void draw();

    /**
     * Рассчитать площадь фигуры.
     */

    double area();

    /**
     * Получить объект фигуры.
     */

    Figure getFigure();
}
