package com.example.crudstudentapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.example.crudstudentapp.models.Province;
import com.example.crudstudentapp.models.Student;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class BaseActivity extends AppCompatActivity {
    protected List<Student> studentList = new ArrayList<>();
    protected List<Province> provinceList = new ArrayList<>();

    protected Student getStudentById (int id){
        Student student = new Student();
        for (Student data : studentList) {
            if (data.getId() == id) {
                student = data;
            }
        }
        return student;
    }

    protected List<Student> getAllStudent(){
        if(studentList.size()<0){
            Student student = new Student();
            student.setId(studentList.size()+1);
            student.setFirstName("Sok");
            student.setLastName("Data");
            student.setGender("Male");
            student.setProvince(new Province(1,""));
            student.setAddress("Phnom Penh");
            student.setPhoneNumber("0974007265");
            studentList.add(student);
        }
        return studentList;
    }
}
