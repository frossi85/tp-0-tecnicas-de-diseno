package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by facu on 04/04/15.
 */
public class Paper {

    public Paper vs(Rock rock) {
        return this;
    }

    public Scissors vs(Scissors scissors) {
        return scissors;
    }

    public Paper vs(Paper paper) {
        return this;
    }
}
