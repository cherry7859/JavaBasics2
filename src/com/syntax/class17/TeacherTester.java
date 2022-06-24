package com.syntax.class17;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Zombie";
        teacher.schoolName = "Harvard";
        teacher.printInfo(); // able to access everything indirectly, because the method is public
    }
}
