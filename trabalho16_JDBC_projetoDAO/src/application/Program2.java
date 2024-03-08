package trabalho16_JDBC_projetoDAO.src.application;

import trabalho16_JDBC_projetoDAO.src.model.dao.DaoFactory;
import trabalho16_JDBC_projetoDAO.src.model.dao.DepartmentDao;
import trabalho16_JDBC_projetoDAO.src.model.dao.SellerDao;
import trabalho16_JDBC_projetoDAO.src.model.entites.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println(">>>> Test 1: seller findById <<<<");
        Department department = departmentDao.findById(3);
        System.out.println(department);

    }
}
