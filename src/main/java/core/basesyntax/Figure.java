package core.basesyntax;

public abstract class Figure implements AreaObtain, InfoPrinter {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + "\n\tArea: "
                + String.format("%.2f", obtainArea())
                + " sq. units\n\tColor: "
                + getColor());
    }

    public String getColor() {
        return color;
    }
}
