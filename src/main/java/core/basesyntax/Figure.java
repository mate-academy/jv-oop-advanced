package core.basesyntax;

public abstract class Figure implements DrawInform {
    protected String color;

    public Figure(Colors color) {
        this.color = String.valueOf(color);
    }

    public abstract double getArea();
}

