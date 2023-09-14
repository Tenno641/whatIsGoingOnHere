package solve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");

        int res = 0;
        for (int i = 0; i < size - 1; i++) {
            int first = Integer.parseInt(arr[i]);
            int second = Integer.parseInt(arr[i + 1]);
            if (first * second > res) {
                res = first * second;
            }
        }

        System.out.print(res);

    }

}

enum TimeZone {

    PST("Pacific Standard Time", -8),
    MST("Mountain Standard Time", -7),
    CST("Central Standard Time", -6),
    EST("Eastern Standard Time", -5);

    private final String desc;
    private final int offset;

    TimeZone(String desc, int offset) {
        this.desc = desc;
        this.offset = offset;
    }

    public String getDesc() {
        return desc;
    }

    public int getOffset() {
        return offset;
    }
}