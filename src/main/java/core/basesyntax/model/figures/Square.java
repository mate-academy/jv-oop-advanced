package core.basesyntax.model.figures;

import core.basesyntax.Figure;

/**
 * Реализовать класс расширяющий Figure.
 * Вывести информацию о квадрате.
 * Реализовать метод для рассчета площади.
 * Создать сеттеры для приватных полей.
 * Иметь доступ к приватным полям класса через геттеры.
 * Вернуть объект Square через метод getFigure().
 * Создать поле side -> сторона квадрата.
 * Реализовать пустой конструктор Square(){}.
 * Реализовать перегруженный конструктор Square(double side) {}.
 * Переопределить методы интерфейса Shape.
 */

public class Square extends Figure {

    private double side;

    public Square() {

    }

    /**
     * Инициализировать переменную side.
     * Инициализировать цвет фигуры.
     * Инициализировать название фигуры.
     */

    public Square(double side) {
        this.side = side;
        generateColor();
        setIdentification("square");
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public Figure getFigure() {
        return new Square(Math.random() * 50);
    }
}
