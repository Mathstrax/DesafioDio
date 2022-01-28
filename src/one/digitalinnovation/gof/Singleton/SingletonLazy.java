package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "Preguiçoso".
 *
 * Singleton preguiçoso ele não disponibiliza a instância paro usuario.
 *
 * @author Mathstrax
 *
 *
 *
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();

        }
        return instancia;
    }

}
