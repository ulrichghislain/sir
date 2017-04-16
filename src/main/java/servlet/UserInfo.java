package servlet;

import dao.*;
import domain.*;
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "userinfo", urlPatterns = {"/UserInfo"})
public class UserInfo extends HttpServlet {

    @Override
    public void destroy() {
        try{
            
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            singleton.EntityManager.close();              
        }
    }

    @Override
    public void init(){
       try{
           singleton.EntityManager.getInstance();
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Person> persons = getListPerson();
        request.setAttribute("listPerson", persons);
        this.getServletContext().getRequestDispatcher("/listperson.jsp").forward(request, response);
    }
    
    public void createPerson(HttpServletRequest request, HttpServletResponse response)
    {
        String name = request.getParameter("name");
        String firstname = request.getParameter("firstname");
        String mail = request.getParameter("mail");
        System.out.println("-> "+name);
        PersonDao dao = new PersonDao();
        dao.create(new Person(name, firstname, mail));
    }
    
    public List<Person> getListPerson(){
        PersonDao dao = new PersonDao();
        return (List<Person>)dao.findAll();
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        createPerson(request, response);
        response.sendRedirect("/");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}