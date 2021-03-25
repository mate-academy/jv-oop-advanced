package core.basesyntax;

import core.basesyntax.model.behavior.Shape;
import core.basesyntax.model.state.ColorSupplier;
import core.basesyntax.model.state.FigureSupplier;

/**
 * Класс должен описывать общие свойства и поведение фигуры.
 * Реализовать метод main().
 * Реализовать приватные методы:
 * create() - создать массив фигур.
 * show() - вывести информацию о фигурах.
 * Реализовать поля:
 * identification -> название фигуры.
 * color -> цвет фигуры.
 * Реализовать метод generateColor() для генарации цвета фигуры.
 * Иметь доступ вне класса к полям через геттеры.
 * Реализовать в геттерах проверку на null.
 */

public abstract class Figure implements Shape {

    private String identification;
    private String color;

    protected void generateColor() {
        color = ColorSupplier.generateColor();
    }

    protected void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getColor() {
        if (color == null) {
            throw new NullPointerException("color is null.");
        }
        return color;
    }

    public String getIdentification() {
        if (color == null) {
            throw new NullPointerException("identification is null.");
        }
        return identification;
    }

    /**
     * Создать массив фигур и заполнить его объектами.
     * Вывести информацию о фигурах.
     */

    public static void main(String[] args) {
        Figure[] figures = create();
        show(figures);
    }

    private static Figure[] create() {
        int size = (int)(Math.random() * 25);
        Figure[] figures = new Figure[size];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.generateFigure();
        }
        return figures;
    }

    private static void show(Figure[] figures) {
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
