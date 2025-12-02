package core.basesyntax;

public abstract class AbstractFigure implements Figure, Drawable {

    protected String color;

    protected AbstractFigure(String color) {
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public void draw() {
        String name = this.getClass().getSimpleName().toLowerCase();
        String areaStr = String.format("%.2f", getArea()) + " sq. units";
        String params = getParametersString();
        System.out.println("Figure: "
                + name + ", area: " + areaStr + ", " + params + ", color: " + getColor());
    }

    protected abstract String getParametersString();
}

