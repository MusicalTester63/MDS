package mds.uvod;

public class Student {

    static String surname;
    static String name;
    static int id;
    static int year;

    public Student(String csurname,String cname,int cid,int cyear){

        surname = csurname;
        name = cname;
        id = cid;
        year = cyear;
    }

    @Override
    public String toString() {
        return ("Student surname:"+Student.getStudentSurname()+
                " Student Name: "+ Student.getStudentName() +
                " ID: "+ Student.getID() +
                " Year : " + Student.getYear());
    }

    public static String getStudentSurname() {
        return surname;
    }

    public static String getStudentName() {
        return name;
    }

    public static int getID() {
        return id;
    }

    public static int getYear() {
        return year;
    }
}
