public class Cipher {
    String alphabetUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabetLower = alphabetUpper.toLowerCase();

    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String shiftedAlphabetUpper = alphabetUpper.substring(key) + alphabetUpper.substring(0, key);
        String shiftedAplhabetLower = alphabetLower.substring(key) + alphabetLower.substring(0, key);