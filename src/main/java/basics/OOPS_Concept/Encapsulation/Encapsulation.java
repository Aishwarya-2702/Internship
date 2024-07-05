package basics.OOPS_Concept.Encapsulation;

class Student{
    public int Roll_no;
    public String std_name;
    public String clg_name;

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getClg_name() {
        return clg_name;
    }

    public void setClg_name(String clg_name) {
        this.clg_name = clg_name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.setRoll_no(47);
        st.setStd_name("Abinaya");
        st.setClg_name("Muthayammal Engineering College");


        Student st_1 = new Student();
        st_1.setRoll_no(50);
        st_1.setStd_name("Aishwarya");
        st_1.setClg_name("Muthayammal Engineering College");

        System.out.println(st.getRoll_no()+"\n"+st.getStd_name()+"\n"+st.getClg_name());
        System.out.println(st_1.getRoll_no()+"\n"+st_1.getStd_name()+"\n"+st_1.getClg_name());
    }
}
