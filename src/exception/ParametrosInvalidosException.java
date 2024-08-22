package exception;

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException (){
        super("Parametros invalidos");
    }

    public  ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}
