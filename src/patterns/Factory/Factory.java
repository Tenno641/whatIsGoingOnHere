package patterns.Factory;

abstract class Table {

    String productID;

    public Table(String ID) {
        this.productID = ID;
    }

    String getProductID() {
        return productID;
    }

    void attachLegs() {
        System.out.println("Attaching Legs");
    }

    void attachTop() {
        System.out.println("Attaching tabletop");
    }

}

class officeTable extends Table {

    public officeTable(String ID) {
        super(ID);
    }

}

class kitchenTable extends Table {

    public kitchenTable(String ID) {
        super(ID);
    }

}

abstract class TableCreator {

    abstract Table createTable(String type);

    Table orderTable(String type) {
        Table table = createTable(type);

        if (table == null) {
            System.out.println("Wrong type!");
            return null;
        }
        System.out.println("Making " + table.productID);
        table.attachLegs();
        table.attachTop();
        System.out.println(table.productID + " is done.\n");
        return table;
    }

}

class TableStore extends TableCreator {

    @Override
    Table createTable(String type) {
        if (type.equals("office")) {
            return new officeTable("P0-1");
        } else if (type.equals("kitchen")) {
            return new kitchenTable("P0-2");
        } else return null;
    }
}

public class Factory {

    public static void main(String[] args) {

        TableStore tableStore = new TableStore();

        Table officeTable = tableStore.orderTable("office");

        Table kitchenTable = tableStore.orderTable("kitchen");

    }

}

