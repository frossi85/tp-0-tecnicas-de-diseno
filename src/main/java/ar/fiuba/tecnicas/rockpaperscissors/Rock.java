package ar.fiuba.tecnicas.rockpaperscissors;

/**
 * Created by facu on 04/04/15.
 */
public class Rock {
    public Rock vs(Scissors scissors) {
        return this;
    }

    public Paper vs(Paper paper) {
        return paper;
    }

    public Rock vs(Rock rock) {
        return this;
    }
}
