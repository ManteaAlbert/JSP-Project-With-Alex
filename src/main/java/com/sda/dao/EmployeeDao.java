package com.sda.dao;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
public class EmployeeDao extends GenericDao<Employee>{
    public List<Employee> getListOfEmployees(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Employee> employeeList = new ArrayList<>();
        try {
            String sql = "FROM Employee";
            Query query = session.createQuery(sql);
            employeeList = query.getResultList();
        }catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
        return employeeList;
    }
}