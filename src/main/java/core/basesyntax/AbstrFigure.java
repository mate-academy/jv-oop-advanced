package core.basesyntax;

public abstract class AbstrFigure implements Figure, AreaCalculable {
    private String color;

    public AbstrFigure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure");
    }
}
