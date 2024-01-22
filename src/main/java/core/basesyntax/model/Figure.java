package core.basesyntax.model;

public abstract class Figure implements Drawable, AreaCalculable {
    protected String color;

    @Override
    public void draw() {
        System.out.println(this);
    }
}
