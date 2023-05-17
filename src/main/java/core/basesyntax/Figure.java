package core.basesyntax;

public abstract class Figure {

    private String color;
    private String FigureName;

    public void setColor(String color) {
        this.color =  color;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        FigureName = name;
    }

    public String getName() {
        return FigureName;
    }

    public double obtainArea() {
        return 0.00;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder(this.getName());
        builder.append(", color: ");
        builder.append(this.getColor());
        builder.append(", area: ");
        builder.append(String.format("%.2f", this.obtainArea()));
        builder.append(" sq.units");
        System.out.print(builder.toString());
    }
}
