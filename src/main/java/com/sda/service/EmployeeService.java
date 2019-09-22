package com.sda.service;

import com.mysql.cj.Query;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findById(Long id){
        return employeeDao.getEntityById(Employee.class, id);
    }
    public List<Employee> getEmployeesList(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Employee> employeeList = new ArrayList<>();
        try{
            String sql = "from Employees";
            Query query = (Query) session.createQuery(sql,Employee.class);
            employeeList = ((org.hibernate.query.Query) query).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
transaction.commit();
        session.close();
        return  employeeList;

    }
    public void saveEmployee ( Employee employee){
        employeeDao.createEntity(employee);
    }
}
