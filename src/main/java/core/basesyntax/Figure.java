package core.basesyntax;

public abstract class Figure implements FiguresBehavior {
    protected double square;
    protected String color;
    private ColrSupplier colorSuppliers;

    public Figure(ColorSupplier colorSuppliers) {
        this.colorSuppliers = colorSuppliers;
        this.color = this.colorSuppliers.getRandomColor();
	}

	public Figure(String color) {
        this.colorSuppliers = new ColorSupplier();
        this.color = color;
	}
}
