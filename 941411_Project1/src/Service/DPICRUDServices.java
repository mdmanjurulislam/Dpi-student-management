package Service;
import java.util.ArrayList;
import DPIStudentSystem.DPIStudentForm;


public class DPICRUDServices {

    // create | post
    public static void create(DPIStudentForm st, ArrayList<DPIStudentForm> db)
    {
        for (DPIStudentForm student: db)
        {
            if (student.id == st.id)
            {
                System.out.println("This Id already taken");
                return;
            }
        }
        db.add(st);
        System.out.println("Your Information Successfully added.");
    }

    // read | get
    public static void filterById(int id, ArrayList<DPIStudentForm> db)
    {
        for (DPIStudentForm st: db)
        {
            if (st.id == id)
            {
                System.out.println("Student Information:");
                System.out.println("Id              : " + st.id);
                System.out.println("Name            : " + st.name);
                System.out.println("Age             : " + st.age);
                System.out.println("Department      : " + st.department);
                System.out.println("Admission Year  : " + st.admissionYear);
                System.out.println("Address         : " + st.getAddress());
                return;
            }
        }
        System.out.println("Your Information Not Found in Database.");
    }

    // update
    public static void update(DPIStudentForm st, ArrayList<DPIStudentForm> db)
    {
        int update_index = 0;
        for (DPIStudentForm student: db)
        {
            if (student.id == st.id)
            {
                db.remove(update_index);
                db.add(st);
                return;
            }
            update_index ++;
        }
        System.out.println("Your Information Not Found in Database");
    }

    // delete
    public static void delete(int id, ArrayList<DPIStudentForm> db)
    {
        int item_index = 0;
        for (DPIStudentForm st: db)
        {
            if (st.id == id) {
                db.remove(item_index);
                return;
            }
            item_index ++;
        }
        System.out.println("This Item Not Found in Database");
    }
}
