public class Cipher {
    String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabetLower = alphabetUpper.toLowerCase();

    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String shiftedAlphabetUpper = alphabetUpper.substring(key) + alphabetUpper.substring(0, key);
        String shiftedAplhabetLower = alphabetLower.substring(key) + alphabetLower.substring(0, key);
        for (int i = 0; i < encrypted.length(); i++) {
            char currentChar = encrypted.charAt(i);

            if (alphabetUpper.indexOf(currentChar) != -1) {
                int indexOfChar = alphabetUpper.indexOf(currentChar);
                char newChar = shiftedAlphabetUpper.charAt(indexOfChar);
                encrypted.setCharAt(i, newChar);
            }
            else if (alphabetLower.indexOf(currentChar) != -1) {
                int indexOfChar = alphabetLower.indexOf(currentChar);
                char newChar = shiftedAplhabetLower.charAt(indexOfChar);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }
}
