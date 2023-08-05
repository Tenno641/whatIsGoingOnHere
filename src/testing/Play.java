package testing;

import java.util.*;


public class Play {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();

        lst.add("Ahmed");
        lst.add("Mohamed");
        lst.add("Ali");
        lst.add("ahmed");

        Collections.sort(lst);

        System.out.println(lst);

    }

}

class Coin implements Comparable<Coin> {
    private final int nominalValue;    // nominal value
    private final int mintYear;        // the year the coin was minted

    Coin(int nominalValue, int mintYear) {
        this.nominalValue = nominalValue;
        this.mintYear = mintYear;
    }

    @Override
    public int compareTo(Coin other) {
        return 0;
    }

    // We consider two coins equal if they have the same nominal value
    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Coin coin = (Coin) that;
        return nominalValue == coin.nominalValue;
    }

    // getters, setters, hashCode and toString
}