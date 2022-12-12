package core.basesyntax;

public abstract class Figure implements Behaviour {
    private String color;

    public String setColor(Color defaultColor) {
        return this.color = defaultColor.getValue();
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return null;
    }
}
