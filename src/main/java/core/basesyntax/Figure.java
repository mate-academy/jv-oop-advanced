package core.basesyntax;


public abstract class Figure {
    protected Colour colour;
    protected int area;

    public void draw() {
        System.out.println(getClass().getSimpleName() + " is draw");
    }

    public String getColour() {
        return colour.name();
    }

    public abstract void getArea();
}
