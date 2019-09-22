package com.sda.service;

import com.mysql.cj.Query;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    public Department findById(Long id){
        return departmentDao.getEntityById(Department.class, id);
    }
    public List<Department> getDepartmentList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Department> departmentList = new ArrayList<>();
        try{
            String sql = "from Departments";
            Query query = (Query) session.createQuery(sql,Department.class);
            departmentList = ((org.hibernate.query.Query) query).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        transaction.commit();
        session.close();
        return  departmentList;

    }
    public void saveDepartment ( Department department){
        departmentDao.createEntity(department);
    }
}