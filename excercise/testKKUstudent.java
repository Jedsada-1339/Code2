public class testKKUstudent {

    public static void main(String[] args) {
        KKUStudent manee = new KKUStudent();
        manee.setName("Manee");
        manee.setGPA(3.2);
        System.out.println("Manee's name is " + manee.getName() + " GPA is " + manee.getGPA());
        KKUStudent mana = new KKUStudent("Mana");
        mana.setGPA(3.4);
        System.out.println("Mana's name is " + mana.getName() + " GPA is " + mana.getGPA());
        System.out.println("Mana's university is " + KKUStudent.getUniName());
    }
}
