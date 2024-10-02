package core.basesyntax;

public abstract class Figure implements Draw {

    protected Color color;

    protected Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public void draw() {
        System.out.print(String.format("%s. Color: %s. ", this.getClass().getSimpleName(), color));
    }
}
