package core.basesyntax;

public class Figure {

    private String color;
    private String name;

    public void draw() {
        System.out.println(this);
    }

    public Figure() {
    }

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Figure{"
                + "color='"
                + color
                + ", "
                + "name='"
                + name
                + '\''
                + '}';
    }

}
