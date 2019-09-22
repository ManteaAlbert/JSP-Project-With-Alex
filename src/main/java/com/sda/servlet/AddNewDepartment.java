package com.sda.servlet;
import com.sda.model.Department;
import com.sda.service.DepartmentService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
@WebServlet(value = "/AddNewDepartment")
public class AddNewDepartment extends HttpServlet {
    private DepartmentService departmentService = new DepartmentService ();
    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("department");
        Department department = new Department ();
        department.setName ( name );
        departmentService.saveDepartment(department);
        try {
            response.sendRedirect("departments.jsp"); //logged-in page
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}