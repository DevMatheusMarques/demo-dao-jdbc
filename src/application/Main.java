package application;

import com.mysql.cj.jdbc.Driver;
import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.entities.Department;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) {
        Department department = new Department(1, "RH");
        System.out.println(department);
    }
}