package trabalho16_JDBC_projetoDAO.src.application;

import trabalho16_JDBC_projetoDAO.src.model.dao.DaoFactory;
import trabalho16_JDBC_projetoDAO.src.model.dao.DepartmentDao;
import trabalho16_JDBC_projetoDAO.src.model.entites.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Department> list;

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println(">>>> Test 1: department findById <<<<");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("\n>>>> Test 2: department findAll <<<<");
        list = departmentDao.findAll();
        for(Department obj:list){
            System.out.println(obj);
        }

        /*
        System.out.println("\n>>>> Test 3: department insert <<<<");
        Department newDepartment = new Department(5, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id = " + newDepartment.getId());
        */

        /*
        System.out.println("\n>>>> Test 4: department update <<<<");
        department = departmentDao.findById(1);
        department.setName("Food");
        departmentDao.update(department);
        System.out.println("Uptade completed!");
         */

        /*
        System.out.println("\n>>>> Test 5: department delete <<<<");
        System.out.print("Qual ID deseja apagar: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
         */
        
        sc.close();
    }
}
