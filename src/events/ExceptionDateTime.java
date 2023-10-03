package events;

import java.time.LocalDate;

public class ExceptionDateTime extends Exception{
    public ExceptionDateTime(String message){
        super(message);
    }
    public void validateDate(LocalDate dateInt, LocalDate dateEnd) throws ExceptionDateTime{

        if(dateInt.compareTo(dateEnd) <0)
        throw new ExceptionDateTime("DateInt is bigger that DateEnd!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}