package core.basesyntax;

public abstract class Figure implements AreaGetterInterface, AbleToDraw {
        private String color, name;


    public Figure() {
    }
    public Figure(String color) {
        this.color = color;
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
}
