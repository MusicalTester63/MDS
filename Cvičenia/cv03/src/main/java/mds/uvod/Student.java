package mds.uvod;

public class Student {

    private final String surname;
    private final String name;
    private final Integer id;
    private final int year;

    public Student(String surname,String name,int id,int year){

        this.surname = surname;
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public Integer getId(){
        return id;
    }

    public Integer getYear(){
        return year;
    }

    @Override
    public String toString() {
        return ("Student surname:"+getSurname()+"<br>"+
                " Student Name: "+getName()+"<br>"+
                " ID: "+getId()+"<br>"+
                " Year : " +getYear()+"<br>");
    }


}
