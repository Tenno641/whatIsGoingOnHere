package patterns.Template;

public class Template {

    public static void main(String[] args) {
        EngineersDailyRoutine electrical = new ElectricalEngineer();

        electrical.work();

        EngineersDailyRoutine mechanical = new MechanicalEngineer();

        mechanical.work();

    }

}

abstract class EngineersDailyRoutine {

    public void work() {
        goToWork();
        beSalve();
        getPaid();
    }

    public void goToWork() {
        System.out.println("On my way");
    }

    protected abstract void beSalve();

    protected abstract void getPaid();

}

class ElectricalEngineer extends EngineersDailyRoutine {

    @Override
    public void beSalve() {
        System.out.println("Electrical Engineer Working");
    }

    @Override
    public void getPaid() {
        System.out.println("Electrical Engineer salary is 253254353252");
    }

}

class MechanicalEngineer extends EngineersDailyRoutine {

    @Override
    public void beSalve() {
        System.out.println("Mechanical Engineer working");
    }

    @Override
    public void getPaid() {
        System.out.println("Mechanical Engineer salary is 3523523532523");
    }

}

