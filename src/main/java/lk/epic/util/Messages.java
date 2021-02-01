package lk.epic.util;

import lk.epic.mode.Student;
import org.springframework.stereotype.Component;

@Component
public class Messages {

    public Student getMessage(){
        return new Student(1,"xyz");
    }

}
