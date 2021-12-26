import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "KhachHangServlet",value = "")
public class KhachHangServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<KhachHang> khachHangList= new ArrayList<>();
        khachHangList.add(new KhachHang("khanh"," 01-03-1996", "Quang Binh","images/hinh-nen-4k-tuyet-dep-cho-may-tinh-05 (1).jpg"));
        khachHangList.add(new KhachHang("Dung"," 06-03-1996", "Quang Ngai","images/hinh-nen-mat-ho-em-a_014750004.jpg"));
        khachHangList.add(new KhachHang("Kha"," 08-03-1996", "Quang Ninh","images/hinh-nen-may-tinh-1.jpg"));
        khachHangList.add(new KhachHang("Linh"," 09-03-1996", "Da Nang","images/hinh-nen-may-tinh-4k-game-min.jpg"));
        khachHangList.add(new KhachHang("Lam"," 15-03-1996", "Sai Gon","images/hinh-nen-may-tinh-11.jpg"));

        request.setAttribute("khachHang" , khachHangList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
