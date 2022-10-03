package mds.uvod;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("ukol")
public class StudentWork {


    @GetMapping("student")
    public String printStudent(@RequestParam(defaultValue = "Student: David Hamran ") String name, @RequestParam(defaultValue = "ID: 230253 ") String id){
        return String.format("Student:"+name+" ID:" + id);
    }




    @GetMapping("students")
    public String printStudents(){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Carboch","David",221654,2000));
        students.add(new Student("Černohous","Matěj",229997,2000));
        students.add(new Student("Mička","Petr",230132,2000));
        students.add(new Student("Hamran","David",230253,2001));
        students.add(new Student("Babeľa","Miroslav",230530,2000));
        students.add(new Student("Balušík","Peter",230531,2001));
        students.add(new Student("Bílek","František",230534,2001));
        students.add(new Student("Bukovský","Jan",230535,2000));
        students.add(new Student("Buzovský","Viktor",230536,2001));
        students.add(new Student("Ďuráč","Jakub",230546,2001));
        students.add(new Student("Gradoš","Matej",230551,2001));
        students.add(new Student("Horčička","Patrik",230558,2000));
        students.add(new Student("Jílek","Jiří",230573,2001));
        students.add(new Student("Klíma","Petr",230586,2001));
        students.add(new Student("Kounický","Filip",230597,2000));
        students.add(new Student("Král","Lukáš",230601,2001));
        students.add(new Student("Kubant","Michal",230608,2001));
        students.add(new Student("Dudar","Oleksandra",230847,2002));
        students.add(new Student("Fišarová","Anežka",230890,2001));
        students.add(new Student("Valíček","Matěj",230903,2001));
        students.add(new Student("Wittner","Alex",230914,2000));
        students.add(new Student("Zdražil","Jakub",230917,2000));
        students.add(new Student("Sadecká","Valentýna",231275,2000));
        students.add(new Student("Brandejs","Jakub",233264,2000));
        students.add(new Student("Kohout","David",195823,1996));
        students.add(new Student("Masaryk","Tomáš",123456,1850));

        String finalPrint ="";

        for(Student stud : students){

            finalPrint += stud.toString();
            finalPrint +="<br>";

        }


        return finalPrint;
    }


}
