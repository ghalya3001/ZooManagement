import java.util.Comparator;

public class EmployeIdComparator implements Comparator<employe> {
    @Override
    public int compare(employe e1, employe e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
    }

