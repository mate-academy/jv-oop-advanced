
package core.basesyntax;

public abstract class Figure implements FigureBehaviour, FigureDraw {
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
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append(this.getName());
        builder.append(", area: ");
        builder.append(String.format("%.1f", this.obtainArea()));
        builder.append(" sq.units");
        System.out.print(builder.toString());
    }
}
