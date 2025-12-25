package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculable, Drawable {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getName()
                + ", area: "
                + getArea()
                + " sq. units, "
                + getDetails()
                + ", color: "
                + color.toLowerCase());
    }

    public abstract String getName();

    public abstract String getDetails();

}
