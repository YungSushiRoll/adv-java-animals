package us.mattgreen;

public class InputTypeVerifier extends Exception {

    public InputTypeVerifier(String type) {
        super("Incorrect user input: " + type);
    }

    public String NotAStringException() {

    }
}
