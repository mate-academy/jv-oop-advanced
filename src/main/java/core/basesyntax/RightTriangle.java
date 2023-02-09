package core.basesyntax;

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    
    public RightTriangle(double firstLeg, double secondLeg, ColorSupplier ColorSupplier) {
        super(ColorSupplier);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        calcSquare();
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", square) + " sq.units, firstLeg: "
                + String.format("%.2f", firstLeg) + ", secondLeg: "
                + String.format("%.2f", secondLeg) + " units, color: " + color);
    }
	
	private void calcSquare() {
        this.square = (firstLeg * secondLeg) / 2;
    }

}
