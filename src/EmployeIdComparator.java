import java.util.Comparator;

public class EmployeIdComparator implements Comparator<employe> {
    @Override
    public int compare(employe emp1, employe emp2) {
            return Integer.compare(emp1.getId(), emp2.getId());

        }
    }

