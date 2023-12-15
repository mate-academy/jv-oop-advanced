package core.basesyntax.figures;

import static core.basesyntax.utils.NumberRounder.round;

public abstract class Figure implements AreaCalculable, Drawable {
    private String name;
    private Color color;

    public Figure(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getInfo() {
        return "Figure: " + name
                + ", color: " + color.name().toLowerCase()
                + ", area: " + round(getArea()) + " sq. units";
    }

    @Override
    public void draw() {
        System.out.println(getInfo());
    }
}
