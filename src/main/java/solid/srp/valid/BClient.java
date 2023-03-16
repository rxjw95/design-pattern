package solid.srp.valid;

import java.util.Collections;
import java.util.List;

public class BClient {

    public void service(List<Student> group) {
        Collections.sort(group, new SortStudentById());
    }
}
