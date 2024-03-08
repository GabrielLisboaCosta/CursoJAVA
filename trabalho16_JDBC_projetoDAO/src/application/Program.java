package trabalho16_JDBC_projetoDAO.src.application;

import trabalho16_JDBC_projetoDAO.src.model.dao.DaoFactory;
import trabalho16_JDBC_projetoDAO.src.model.dao.SellerDao;
import trabalho16_JDBC_projetoDAO.src.model.entites.Department;
import trabalho16_JDBC_projetoDAO.src.model.entites.Seller;

import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(">>>> Test 1: seller findById <<<<");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n>>>> Test 2: seller findDepartment <<<<");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj: list){
            System.out.println(obj);
        }

        System.out.println("\n>>>> Test 3: seller findAll <<<<");
        list = sellerDao.findAll();
        for(Seller obj: list){
            System.out.println(obj);
        }

        /*
        System.out.println("\n>>>> Test 4: seller Insert <<<<");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());
         */

        /*
        System.out.println("\n>>>> Test 5: seller Update <<<<");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed!");
         */

        /*
        System.out.println("\n>>>> Test 6: seller Delete <<<<");
        System.out.print("Qual ID deseja apagar: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        */
        sc.close();
    }
}