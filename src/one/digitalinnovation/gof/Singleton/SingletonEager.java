package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "apressado"
 *
 *  ele instancia direto, enquanto o preguiçoso faz a verificação
 *
 * @author  Mathstrax
 */

public class SingletonEager {

    private static final SingletonEager instancia =  new SingletonEager();

    private  SingletonEager() {
        super();
    }
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
