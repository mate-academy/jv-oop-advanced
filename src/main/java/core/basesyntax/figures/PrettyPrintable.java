package core.basesyntax.figures;

public interface PrettyPrintable {
    default String roundDouble(double num) {
        // Prints out only 2 digits after point for doubles
        return String.format("%.2f", num);
    }
}
