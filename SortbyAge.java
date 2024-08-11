import java.util.Comparator;

public class SortbyAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getNamSinh() > o2.getNamSinh()) return -1;
        else if(o1.getNamSinh() < o2.getNamSinh()) return 1;
        else return 0;
    }
}
