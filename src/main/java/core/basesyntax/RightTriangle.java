package core.basesyntax;

public class RightTriangle extends FigureSupplier implements BehaviourFigures {
    RightTriangle() {
        this.setSizeA(20);
        this.setSizeB(60);
        this.setName("Right Triangle");
        this.setColor(Color.BLACK);
    }

    @Override
    public Figure getRandomFigure() {
        Figure rightTriangle = new Figure();
        rightTriangle.setArea(getSizeA() * getSizeB() / 2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ").append(this.getName())
                .append(", area: ").append(rightTriangle.getArea()).append(" sq.units ,size a: ")
                .append(getSizeA()).append("units ,size b: ").append(getSizeB())
                .append(" units, color: ").append(getColor());
        rightTriangle.setText(stringBuilder.toString());
        return rightTriangle;
    }
}
