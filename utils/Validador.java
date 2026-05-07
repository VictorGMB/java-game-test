package utils;

import java.util.function.Supplier;

public class Validador {

    public static <T> T naoNuloOuVazio(T dado, Supplier<? extends RuntimeException> exceptionSupplier) {
        if (isNull(dado) || (dado instanceof String s && isBlank(s))) {
            throw exceptionSupplier.get();
        }
        return dado;
    }
    
    private static <T> boolean isNull(T dado) {
        return dado == null;
    }

    private static boolean isBlank(String dado) {
        return dado.isBlank();
    }
}
