public class testKKUstudent {

    public static class KKUStudent {
        private String name;
        private double GPA;
        private static int numStudents = 0;
        private static String uniName = "KKU";

        // Default constructor
        public KKUStudent() {
            numStudents++;
        }

        // Parameterized constructor
        public KKUStudent(String name) {
            this.name = name;
            numStudents++;
        }

        // Getter and setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGPA() {
            return GPA;
        }

        public void setGPA(double GPA) {
            this.GPA = GPA;
        }

        public static int getNumStudents() {
            return numStudents;
        }

        public static String getUniName() {
            return uniName;
        }
    }

    public static void main(String[] args) {
        KKUStudent manee = new KKUStudent();
        manee.setName("Manee");
        manee.setGPA(3.2);
        System.out.println("Manee's name is " + manee.getName() + " GPA is " + manee.getGPA());
        KKUStudent mana = new KKUStudent("Mana");
        mana.setGPA(3.4);
        System.out.println("Num students is " + KKUStudent.getNumStudents());
        System.out.println("Mana's name is " + mana.getName() + " GPA is " + mana.getGPA());
        System.out.println("Mana's university is " + KKUStudent.getUniName());
    }
}
