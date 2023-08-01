package testing;

import java.lang.Exception;

public class Play {

    public static void main(String[] args) throws Throwable {

        myException e = new myException(new RuntimeException("This is an Exception"));

        System.out.println(e.getCause());

    }

}

class myException extends Exception{

    public myException(String msg) {
        super(msg);
    }

    public myException(Exception e) {
        super(e);
    }

}
