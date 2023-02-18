package Exceptions;

public class ObjectIsNotAliveException extends Exception {
    public ObjectIsNotAliveException()
    {
        super("Entity is not alive and can not do that");
    }

    @Override
    public String toString()
    {
        return "[Exception] Entity is not alive";
    }
}
