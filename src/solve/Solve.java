package solve;

public class Solve {

    public static String solve(String[] strs) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < strs.length; i++) {
            char first = strs[0].charAt(i);

            for (int j = 0; j < strs.length - 1; j++) {
                if (first != strs[j + 1].charAt(i)) {
                    return res.toString();
                }
            }

            res.append(first);

        }

        return "";

    }

    public static void main(String[] args) {

        String[] arr = {"flower","flow","flight"};

        System.out.print(solve(arr));

    }

}