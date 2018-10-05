package com.company;
//Q1 Implement Singleton Design Pattern on a dummy class.

class DataBase{
    int port;
    String dataBase;
    static DataBase obj;

    private DataBase(int port, String dataBase) {
        this.port = port;
        this.dataBase = dataBase;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "port=" + port +
                ", dataBase='" + dataBase + '\'' +
                '}';
    }

    static DataBase getInstance(){
        if(obj==null){
            obj = new DataBase(8080,"MongoDB");
        }
        return obj;
    }

}

public class Q1SingletonDesignPattern {
    public static void main(String[] args) {
        System.out.println(DataBase.getInstance());
//        DataBase obj1= new DataBase(1021,"sumit");
//        System.out.println(obj1.port);

    }
}
