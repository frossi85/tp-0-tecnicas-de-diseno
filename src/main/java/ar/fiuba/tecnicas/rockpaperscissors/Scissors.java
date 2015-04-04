package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by facu on 04/04/15.
 */
public class Scissors {
    public Scissors vs(Paper paper) {
        return this;
    }

    public Rock vs(Rock rock) {
        return rock;
    }

    public Scissors vs(Scissors scissors) {
        return scissors;
    }
}
