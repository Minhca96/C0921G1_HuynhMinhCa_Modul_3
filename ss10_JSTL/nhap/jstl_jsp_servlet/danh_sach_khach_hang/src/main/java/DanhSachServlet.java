import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DanhSachServlet",value="")
public class DanhSachServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<KhachHang> list= new ArrayList<>();
        list.add(new KhachHang("Huynh Minh Ca", 25, "Quang Nam","THPT Phan Boi CHau","images/hinh-nen-4k-tuyet-dep-cho-may-tinh-05 (1).jpg"));
        list.add(new KhachHang("duong Van Lam", 25, "Quang Nam","THPT Phan Boi CHau","images/hinh-nen-mat-ho-em-a_014750004.jpg"));
        list.add(new KhachHang("Nguyen Quoc Khanh", 25, "Quang Nam","THPT Phan Boi CHau","images/hinh-nen-may-tinh-1.jpg"));
        list.add(new KhachHang("Huynh Chau Trong", 25, "Quang Nam","THPT Phan Boi CHau","images/hinh-nen-may-tinh-1.jpg"));
        list.add(new KhachHang("Huynh Thi Kieu Trinh", 25, "Quang Nam","THPT Phan Boi CHau","images/hinh-nen-may-tinh-11.jpg"));

        request.setAttribute("listKH", list );
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
