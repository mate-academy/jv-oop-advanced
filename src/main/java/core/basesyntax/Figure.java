package core.basesyntax;

public abstract class Figure implements AreaCalculator, FigureDraw {
    private String color;
    private String figureName;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        figureName = name;
    }

    public String getName() {
        return figureName;
    }

    public void draw() {
        String string =  "Figure: " + this.getName() + ", area: " + String.format("%.1f", this.obtainArea()) + " sq.units";
        System.out.print(string);
    }
}
