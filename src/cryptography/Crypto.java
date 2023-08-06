package cryptography;

public class Crypto {

    private final String plainText;

    public Crypto(String plainText, String state) {
        this.plainText = plainText;
        if (state.equals("encode")) {
            System.out.println(getEncoded());
        } else {
            System.out.println(getDecoded());
        }

    }

    public String getEncoded() {
        StringBuilder result = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            result.append((char) (c + 2));
        }

        return result.toString();

    }

    public String getDecoded() {
        StringBuilder result = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            result.append((char) (c - 2));
        }

        return result.toString();
    }

}
