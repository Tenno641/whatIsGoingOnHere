package cryptography;

public class Crypto {

    private final String plainText;

    public Crypto(String plainText, String state, int shift) {
        this.plainText = plainText;
        if (state.equals("encode")) {
            System.out.println(getEncoded(shift));
        } else {
            System.out.println(getDecoded(shift));
        }

    }

    public String getEncoded(int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            result.append((char) (c + shift));
        }

        return result.toString();

    }

    public String getDecoded(int shift) {
        StringBuilder result = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            result.append((char) (c - shift));
        }

        return result.toString();
    }

}
