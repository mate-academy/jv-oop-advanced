package core.basesyntax;

public abstract class Figure implements Figures {
    protected Name name;
    protected Color color;
    protected double area;

    public abstract Name getName();

    public abstract double getArea();

    public abstract Color getColor();
}
