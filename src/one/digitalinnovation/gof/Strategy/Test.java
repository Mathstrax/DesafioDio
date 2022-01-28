package one.digitalinnovation.gof.Strategy;

public class Test {
    public static void main(String[] args) {
        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();


        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();




    }
}
