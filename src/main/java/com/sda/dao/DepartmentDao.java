package com.sda.dao;
import com.sda.model.Department;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
public class DepartmentDao extends GenericDao<Department>{
    public List<Department> getListOfDepartments(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Department> departmentList = new ArrayList<>();
        try {
            String sql = "FROM Department";
            Query query = session.createQuery(sql);
            departmentList = query.getResultList();
        }catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
        return departmentList;
    }
}