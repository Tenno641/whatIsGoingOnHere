package solve;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        TimeZone timeZone = TimeZone.PST;
        System.out.println(timeZone);

        String timeZone1 = TimeZone.PST.name();


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