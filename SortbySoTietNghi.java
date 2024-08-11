import java.util.Comparator;

public class SortbySoTietNghi implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getSoTietNghi() > s2.getSoTietNghi()) return -1;
        else if(s1.getSoTietNghi() < s2.getSoTietNghi()) return 1;
        else return 0;
    }
}
