package core.basesyntax;

public abstract class Figure {
    protected String color; // Цвет фигуры. protected - виден этому классу и его наследникам

    // Конструктор, который будет вызываться из конструкторов дочерних классов
    public Figure(String color) {
        this.color = color;
    }

    // Абстрактный метод для получения площади.
    // Каждая конкретная фигура должна будет реализовать этот метод.
    public abstract double getArea();

    // Абстрактный метод для "рисования" фигуры.
    // Каждая конкретная фигура должна будет реализовать этот метод.
    // Он не должен переопределять toString()!
    public abstract void draw();

}
