package methodreferences;

public class References {



}

class Employee {

    String name;
    String email;
    int experience;

    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    String mainLanguages;
    String[] skills;

    public Developer(String name, String email, int experience, String mainLanguages, String[] skills) {
        super(name, email, experience);
        this.mainLanguages = mainLanguages;
        this.skills = skills;
    }

    public String getMainLanguage() {
        return mainLanguages;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    boolean phd;
    String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}