package module7.activity;

//Custom exception class
public class CustomExceptionActivity extends Exception {

    @Override
    public String getMessage() {
        return "You are not allowed to use this program";
    }
}