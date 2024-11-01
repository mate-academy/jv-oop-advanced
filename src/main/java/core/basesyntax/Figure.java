package core.basesyntax;

public class Figure implements AreaCalculator{
    private String color;
    private String name;

    public Figure(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Figure() {
    }

    public void draw() {
        System.out.println(this);
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

    @Override
    public int calculateArea() {
        return 0;
    }
}
