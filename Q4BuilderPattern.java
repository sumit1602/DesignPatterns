package com.company;
// Q4. Implement Builder pattern to create a student object with more than 6 fields.
class Student{
    private String name;
    private int age;
    private String companyName;
    private String qualification;
    private boolean passPort;
    private String placeOfBirth;

    public Student(StudentBuilder studentBuilder) {
           name = studentBuilder.getName();
           age = studentBuilder.getAge();
           companyName = studentBuilder.getCompanyName();
           qualification = studentBuilder.getQualification();
           passPort = studentBuilder.isPassPort();
           placeOfBirth = studentBuilder.getPlaceOfBirth();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public boolean isPassPort() {
        return passPort;
    }

    public void setPassPort(boolean passPort) {
        this.passPort = passPort;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", companyName='" + companyName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", passPort=" + passPort +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private int age;
    private String companyName;
    private String qualification;
    private boolean passPort;
    private String placeOfBirth;

    public StudentBuilder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public StudentBuilder isinCompanyName(String companyName) {
        this.companyName = companyName;
        return  this;
    }

    public String getQualification() {
        return qualification;
    }

    public StudentBuilder doneQualification(String qualification) {
        this.qualification = qualification;
        return this;
    }

    public boolean isPassPort() {
        return passPort;
    }

    public StudentBuilder havePassPort(boolean passPort) {
        this.passPort = passPort;
        return this;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public StudentBuilder from(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
public class Q4BuilderPattern {
    public static void main(String[] args) {
        Student student = new StudentBuilder("SUMIT",22)
                .from("Delhi")
                .havePassPort(true)
                .doneQualification("Btech")
                .isinCompanyName("TTN").build();
        System.out.println(student);

    }
}
