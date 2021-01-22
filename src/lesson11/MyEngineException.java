package lesson11;

public class MyEngineException extends Exception {

    public MyEngineException(){

    }

    public MyEngineException(String message){
        super(message);
    }

    public MyEngineException(String message, Throwable cause){
        super(message, cause);
    }

    public MyEngineException(Throwable exception){
        super(exception);
    }

}
