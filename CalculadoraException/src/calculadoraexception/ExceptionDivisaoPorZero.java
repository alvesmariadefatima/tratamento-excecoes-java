package calculadoraexception;

public class ExceptionDivisaoPorZero extends Exception{
        public String getMessage(){
            return "Não existe divisão por zero. Tente Novamente...";   
    }
}
