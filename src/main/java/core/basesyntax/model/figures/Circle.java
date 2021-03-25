package core.basesyntax.model.figures;

import core.basesyntax.Figure;

/**
 * Реализовать класс расширяющий Figure.
 * Вывести информацию о круге.
 * Реализовать метод для рассчета площади.
 * Создать сеттеры для приватных полей.
 * Иметь доступ к приватным полям класса через геттеры.
 * Вернуть объект Circle через метод getFigure().
 * Создать поля поле radius -> радиус.
 * Реализовать пустой конструктор Circle(){}.
 * Реализовать перегруженный конструктор Circle(double radius) {}.
 * Переопределить методы интерфейса Shape.
 */

public class Circle extends Figure {

    private double radius;

    public Circle() {

    }

    /**
     * Инициализировать переменную length.
     * Инициализировать переменную width.
     * Инициализировать цвет фигуры.
     * Инициализировать название фигуры.
     */

    public Circle(double radius) {
        this.radius = radius;
        generateColor();
        setIdentification("circle");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Figure getFigure() {
        return new Circle(Math.random() * 50);
    }
}
