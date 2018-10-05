package com.company;

import java.util.ArrayList;
import java.util.List;

//Component
interface Directory {
    void showDirectoryDetails();
}
//Leaf
class Developer implements Directory {
    private String name;
    private String favoriteLanguage;

    public Developer(String name, String favoriteLanguage) {
        this.name = name;
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Developer{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                '}';
    }
}

//leaf
class Manager implements Directory{

    private String name;
    private String type;

    public Manager(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

//Composite
class DeveloperDirectory implements Directory{

    List<Directory> developerDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Developer Directory");
        developerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite
class ManagerDirectory implements Directory{

    List<Directory> managerDirectory = new ArrayList<Directory>();

    @Override
    public void showDirectoryDetails() {
        System.out.println("Manager Directory");
        managerDirectory.forEach(e->e.showDirectoryDetails());
    }
}

//Composite

class CompanyDirectory implements Directory{

    List<Directory> companyDirectory = new ArrayList<>();

    @Override
    public void showDirectoryDetails() {
        companyDirectory.forEach(e->e.showDirectoryDetails());
    }
}


public class Q7CompositeDesign {

        public static void main(String[] args) {

            Developer developer1 = new Developer("John","Java");
            Developer developer2 = new Developer("Sam","C#");

            Manager manager1 = new Manager("Devin","Associate");
            Manager manager2 = new Manager("James","Senior");

            DeveloperDirectory developerDirectory= new DeveloperDirectory();
            developerDirectory.developerDirectory.add(developer1);
            developerDirectory.developerDirectory.add(developer2);

            ManagerDirectory managerDirectory = new ManagerDirectory();
            managerDirectory.managerDirectory.add(manager1);
            managerDirectory.managerDirectory.add(manager2);

            CompanyDirectory companyDirectory = new CompanyDirectory();
            companyDirectory.companyDirectory.add(developerDirectory);
            companyDirectory.companyDirectory.add(managerDirectory);

            companyDirectory.showDirectoryDetails();



        }
    }

