package core.basesyntax.model.figures;

import core.basesyntax.Figure;

/**
 * Реализовать класс расширяющий Figure.
 * Вывести информацию о прямоугольнике.
 * Реализовать метод для рассчета площади.
 * Создать сеттеры для приватных полей.
 * Иметь доступ к приватным полям класса через геттеры.
 * Вернуть объект Rectangle через метод getFigure().
 * Создать поля:
 * length -> длина
 * width -> ширина
 * Реализовать пустой конструктор Rectangle(){}.
 * Реализовать перегруженный конструктор Rectangle(double length, double width) {}.
 * Переопределить методы интерфейса Shape.
 */

public class Rectangle extends Figure {

    private double length;
    private double width;

    public Rectangle() {

    }

    /**
     * Инициализировать переменную length.
     * Инициализировать переменную width.
     * Инициализировать цвет фигуры.
     * Инициализировать название фигуры.
     */

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        generateColor();
        setIdentification("rectangle");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, length: " + getLength() + " units, width: "
                + getWidth() + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public Figure getFigure() {
        return new Rectangle(Math.random() * 50, Math.random() * 50);
    }
}
