package us.mattgreen;

public class InputTypeVerifier {

    public static int validateInt(String input) throws BadInputException {
        try {
            int result = Integer.parseInt((input));
            return result;
        } catch (NumberFormatException e) {
            throw new BadInputException();
        }
    }

    public static boolean validateBool(String input) throws BadInputException {
        if (input.equalsIgnoreCase("Y")) {
            return true;
        } else if (input.equalsIgnoreCase("N")) {
            return false;
        }
        throw new BadInputException();
    }
}
