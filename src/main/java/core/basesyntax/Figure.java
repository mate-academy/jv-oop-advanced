package core.basesyntax;

public abstract class Figure implements Drawable, Arable {
    protected String name;
    private Color color;

    public Figure(String name, Color color) {
        this.color = color;
        this.name = name;
    }

    @Override
    public String draw() {
        return "Figure: " + name
                + ", Color: " + color
                +  ", area: " + (double) Math.round(getArea() * 100) / 100 + " sq. units, ";
    }
}
