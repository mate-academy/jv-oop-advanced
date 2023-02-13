package core.basesyntax;

public abstract class Figure implements AreaCalculator {
    private FigureType name;
    private String color;

    public Figure() {
        this.color = "Unknown";
    }

    public Figure(FigureType name, String color) {
        this.name = name;
        this.color = color;
    }

    public FigureType getName() {
        return name;
    }

    public void setName(FigureType name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Figure: ").append(this.name)
                .append(", color: ").append(this.color).toString();
    }

}
