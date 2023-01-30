package core.basesyntax;

public abstract class Figures implements AreaGetter, Draw {
    private String color;

    public String setColor(String color) {
        return this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}
