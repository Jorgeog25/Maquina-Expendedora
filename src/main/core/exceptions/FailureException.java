package main.core.exceptions;

public class FailureException extends Exception{
    public FailureException() {
        super("A failure has occurred");
    }
}
