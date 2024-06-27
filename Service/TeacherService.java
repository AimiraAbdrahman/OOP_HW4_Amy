import less4.model.Teatcher;

public class TeacherService  {

    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }

    public Teacher removeTeacher (int id, String name, String lastName) {
        teachers.remove(Teatcher);
    }

    public Teacher addTeacher (int id, String name, String lastName) {
        teachers.add(Teacher);
    }

}
