package dataBase;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("movie", "name");
        return list;
    }
    public static void main(String[] args)throws Exception, IOException, SQLException, ClassNotFoundException {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("movie","name");
        for(String st:list){
            System.out.println(st);
        }
    }
}