package application;

import com.mysql.cj.jdbc.Driver;
import db.DB;
import db.DbException;
import db.DbIntegrityException;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findyById(3);

        System.out.println(seller);

        System.out.println();

        System.out.println("=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        System.out.println("=== TEST 3: seller findAll =====");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}