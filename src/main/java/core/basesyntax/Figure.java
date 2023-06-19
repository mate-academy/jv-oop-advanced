package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder("Figure: ");
        if (this instanceof FigureDescriptor) {
            sb.append(((FigureDescriptor) this).getShape().getDescription().toLowerCase());
        } else {
            sb.append(this.getClass().getSimpleName().toLowerCase());
        }
        sb.append(", area: ").append(String.format("%.2f", calculateArea()))
                .append(" sq.units, ");
        if (this instanceof FigureDescriptor) {
            sb.append(((FigureDescriptor) this).getSizeDescription());
        } else {
            throw new RuntimeException("Cannot get figure dimensions: "
                    + this.getClass().getName() + ".draw() method should be implemented!");
        }
        sb.append(", color: ").append(getColor().name().toLowerCase());

        System.out.println(sb.toString());
    }
}
