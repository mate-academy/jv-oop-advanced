package core.basesyntax.model.state;

/**
 * Класс должен генерировать случайный цвет.
 * Инициализировать массив строк COLORS.
 * Создать метод для генерации случайного цвета.
 */

public class ColorSupplier {

    private static final String[] COLORS = new String[]{
            "blue", "yellow", "red", "white",
            "black", "green", "orange", "purple",
            "brown", "pink", "gray", "golden"
    };

    /**
     * Вернуть случайный элемент массива COLORS.
     */

    public static String generateColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }
}
