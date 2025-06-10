package core.basesyntax;

public abstract class Figure implements AreaCalculable, Drawble {
    protected String color; // Цвет фигуры. protected - виден этому классу и его наследникам

    // Конструктор, который будет вызываться из конструкторов дочерних классов
    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
