package solve;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        System.out.println(!(line[0].equals(line[1]) || line[0].equals(line[2]) || line[1].equals(line[2])));

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