package application;

import com.mysql.cj.jdbc.Driver;
import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Department department = new Department(1, "RH");

        Seller seller = new Seller(1, "Matheus", "matheus@gmail.com", new Date(), 3000.0, department);

        System.out.println(department);
        System.out.println(seller);
    }
}