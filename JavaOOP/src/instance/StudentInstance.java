package instance;

import model.*;

public class StudentInstance {
    public static void main (String[] args) {
        Student student = new Student("Andrea", 24, '女', "160202103690");
        System.out.println("name:" + student.getName());
        System.out.println("age:" + student.getAge());
        System.out.println("gender:" + student.getGender());
        System.out.println("idNo:" + student.getIdNo());
    }
}
