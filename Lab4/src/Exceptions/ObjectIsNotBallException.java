package Exceptions;

public class ObjectIsNotBallException extends RuntimeException {

    public ObjectIsNotBallException()
    {
        super("Entity is not a ball");
    }

    @Override
    public String toString()
    {
        return "[Exception] Entity is not a ball";
    }
}
