package core.basesyntax.figures;

public interface Printable {
    void draw();

    default String getFormatted(double d) {
        return String.format("%.2f", d);
    }
}
