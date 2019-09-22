package com.sda.servlet;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.service.EmployeeService;
import com.sda.service.UserService;
import org.hibernate.Session;
import javax.persistence.Query;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
@WebServlet(value = "/AddNewEmployee")
public class AddNewEmployee extends HttpServlet {
    private EmployeeService employeeService = new EmployeeService ();
    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        Employee employee = new Employee ();
        employee.setName ( name );
        employeeService.saveEmployee(employee);
        try {
            response.sendRedirect("employees.jsp"); //logged-in page
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}