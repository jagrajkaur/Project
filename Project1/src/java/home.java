
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class home extends HttpServlet {
    
   

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        String myid = req.getParameter("id");
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String mypwd = req.getParameter("pwd");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        String MobileNo = req.getParameter("MobileNo");
        String address = req.getParameter("address");
        String city = " ";
        if(req.getParameter("city")!=null)
        {
            city = req.getParameter("city");
        }
        String [] arr = req.getParameterValues("lang");
        String s=" ";
        String Qualification = "";
        if(req.getParameter("Qualification")!=null)
        {
            Qualification = req.getParameter("Qualification");
        }
        
        PrintWriter out = res.getWriter();
        out.println(myid); 
        out.print(firstname);
        out.println(lastname);
        out.println(mypwd);
        out.println(email);
        out.println(gender);
        out.println(MobileNo);
        out.println(address);
        out.println(city);
        for(String var : arr)
         {
            s = s+var+",";
            
         }
        String temp = s.substring(0,s.length()-1);
        out.println(temp);
        out.println(Qualification);
       
       
    }
   
}
