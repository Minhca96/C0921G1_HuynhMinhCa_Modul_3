import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "product_discount_calculatorServlet", value="/product")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String a=request.getParameter("ListPrice");
    String b=request.getParameter("DiscountPercent");
    double c = Integer.parseInt(a) * Integer.parseInt(b) * 0.01 ;
    request.setAttribute("CalculateDiscount",c);
    request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
