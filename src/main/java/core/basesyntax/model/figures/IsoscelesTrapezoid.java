package core.basesyntax.model.figures;

import core.basesyntax.Figure;

/**
 * Реализовать класс расширяющий Figure.
 * Вывести информацию о прямоугольном треугольнике.
 * Реализовать метод для рассчета площади.
 * Создать сеттеры для приватных полей.
 * Иметь доступ к приватным полям класса через геттеры.
 * Вернуть объект IsoscelesTrapezoid через метод getFigure().
 * Создать поля:
 * baseA -> основа А
 * baseB -> основа B
 * side -> сторона
 * Реализовать пустой конструктор IsoscelesTrapezoid(){}.
 * Реализовать перегруженный конструктор
 * IsoscelesTrapezoid(double baseA, double baseB, double side) {}.
 * Переопределить методы интерфейса Shape.
 */

public class IsoscelesTrapezoid extends Figure {

    private double baseA;
    private double baseB;
    private double side;

    public IsoscelesTrapezoid() {

    }

    /**
     * Инициализировать переменную baseA.
     * Инициализировать переменную baseB.
     * Инициализировать переменную side.
     * Инициализировать цвет фигуры.
     * Инициализировать название фигуры.
     */

    public IsoscelesTrapezoid(double baseA, double baseB, double side) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
        generateColor();
        setIdentification("isosceles trapezoid");
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, baseA: " + baseA + " units, baseB: "
                + baseB + " units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double area() {
        double s = (baseA + baseB + side * side) / 2;
        return Math.sqrt(s * (s - baseA) * (s - baseB) * (s - side));
    }

    @Override
    public Figure getFigure() {
        return new IsoscelesTrapezoid(Math.random() * 50,
                Math.random() * 50, Math.random() * 50);
    }
}
