package trabalho16_JDBC_projetoDAO.src.application;

import trabalho16_JDBC_projetoDAO.src.model.dao.DaoFactory;
import trabalho16_JDBC_projetoDAO.src.model.dao.SellerDao;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();
    }
}
