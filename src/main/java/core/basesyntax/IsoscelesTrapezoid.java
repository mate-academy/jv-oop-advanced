package core.basesyntax;

public class IsoscelesTrapezoid extends FigureSupplier implements BehaviourFigures {
    IsoscelesTrapezoid() {
        this.setSizeA(random.nextInt(MAX_NUMBER));
        this.setSizeB(random.nextInt(MAX_NUMBER));
        this.setName("Isosceles Trapezoid");
        this.setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public Figure getRandomFigure() {
        Figure isoscelesTrapezoid = new Figure();
        isoscelesTrapezoid.setArea(getSizeA() * getSizeB());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ").append(this.getName())
              .append(", area: ").append(isoscelesTrapezoid.getArea())
                .append(" sq.units ,trapezoidal Height: ")
               .append(getSizeA()).append("units ,middle Line: ")
                .append(getSizeB())
                .append(" units, color: ").append(getColor());
        isoscelesTrapezoid.setText(stringBuilder.toString());
        return isoscelesTrapezoid;
    }
}
