package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void draw() {
        System.out.print("Figure: " + toCamelCase(getName())
                + ", area: " + calculateArea() + " sq. units"
                + ", color: " + toCamelCase(getColor()));
    }

    private String toCamelCase(String input) {
        String[] words = input.split("_");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result.append(words[i].toLowerCase());
            } else {
                result.append(words[i].substring(0, 1).toUpperCase())
                        .append(words[i].substring(1).toLowerCase());
            }
        }

        return result.toString();
    }
}
