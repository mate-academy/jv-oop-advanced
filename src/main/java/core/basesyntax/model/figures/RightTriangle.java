package core.basesyntax.model.figures;

import core.basesyntax.Figure;

/**
 * Реализовать класс расширяющий Figure.
 * Вывести информацию о прямоугольном треугольнике.
 * Реализовать метод для рассчета площади.
 * Реализовать метод для рассчета гипотенузы.
 * Создать сеттеры для приватных полей.
 * Иметь доступ к приватным полям класса через геттеры.
 * Вернуть объект RightTriangle через метод getFigure().
 * Создать поля:
 * legA -> катет А
 * legB -> катет B
 * Реализовать пустой конструктор RightTriangle(){}.
 * Реализовать перегруженный конструктор RightTriangle(double legA, double legB) {}.
 * Переопределить методы интерфейса Shape.
 */

public class RightTriangle extends Figure {

    private double legA;
    private double legB;

    public RightTriangle() {

    }

    /**
     * Инициализировать переменную legA.
     * Инициализировать переменную legB.
     * Инициализировать цвет фигуры.
     * Инициализировать название фигуры.
     */

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
        generateColor();
        setIdentification("right triangle");
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public void setLegB(double legB) {
        this.legB = legB;
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public double hypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, legA: " + getLegA() + " units, legB: "
                + getLegB() + "units, color: " + getColor());
    }

    @Override
    public double area() {
        return (legA * legB) / 2;
    }

    @Override
    public Figure getFigure() {
        return new RightTriangle(Math.random() * 50, Math.random() * 50);
    }
}
