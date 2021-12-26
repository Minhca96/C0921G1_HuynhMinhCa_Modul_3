import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TinhServlet", value = "/")
public class TinhServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    double soThuNhat= Integer.parseInt(request.getParameter("so_thu_nhat"));
    double soThuHai= Integer.parseInt(request.getParameter("so_thu_hai"));
    String phepTinh= request.getParameter("phep_tinh");

    try {
        double ketQua = Tinh.tinh(soThuNhat,phepTinh,soThuHai);
        request.setAttribute("ket_qua",ketQua);
    }catch (RuntimeException ex){
        request.setAttribute("ket_qua",ex.getMessage()); //4
    }



    request.getRequestDispatcher("Result.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
