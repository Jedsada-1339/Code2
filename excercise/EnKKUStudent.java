public class EnKKUStudent extends testKKUstudent {
    protected int gearNumber;
    protected String name;
    public int getgearNumber() {
        return gearNumber;
    }

    public void setgearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public EnKKUStudent(String name) {
        this.name = name;
    }

    
    public String toString() {
        return name + " is a KKU Engineering student with gear number as " + gearNumber ;
    }
}