package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalcualtor {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + getArea() + " sq. units, color: " + color);
    }
}
