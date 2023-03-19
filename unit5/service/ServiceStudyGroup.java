package unit5.service;

import unit5.model.Student;
import unit5.model.StudyGroup;
import unit5.model.Teacher;

import java.util.List;

public class ServiceStudyGroup {
    public StudyGroup create(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
