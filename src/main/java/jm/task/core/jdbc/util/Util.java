package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/new";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Qwaszx199498";
    private  Util() {
    }
     public static Connection getConnection () { //Подключаем БД
            try {
                return DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException e) {
                System.out.println("Соединение с БД не установлено");
            } return  getConnection();
        }
    // реализуйте настройку соеденения с БД
}
