package controller;

import bean.BenhAn;
import bean.BenhNhan;
import service.IBenhNhanService;
import service.Impl.BenhNhanService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "BenhNhanServlet", urlPatterns = {"","/BenhNhanServlet"})
public class BenhNhanServlet extends HttpServlet {
    IBenhNhanService iBenhNhanService = new BenhNhanService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "add":
                add(request,response);
                getAllBenhNhan(request,response);
                break;
            case  "edit":
                edit(request,response);
                getAllBenhNhan(request,response);
                break;

        }
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BenhNhan benhNhan = new BenhNhan(
          request.getParameter("maBenhNhan")  ,
          request.getParameter("tenBenhNhan")  ,
          request.getParameter("ngayNhapVien")  ,
          request.getParameter("ngayRaVien")  ,
          request.getParameter("lyDoNhapVien")  ,
          new BenhAn(request.getParameter("maBenhAn"))
        );

       Map<String,String> messenger = iBenhNhanService.add(benhNhan);
       if(!messenger.isEmpty()) {
           request.setAttribute("benhNhan",benhNhan);
           request.setAttribute("messenger1",messenger.get("key"));
           request.getRequestDispatcher("addbenhnhan.jsp").forward(request,response);
       }


    }

    private  void  edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        BenhNhan benhNhan = new BenhNhan(
                request.getParameter("maBenhNhan")  ,
                request.getParameter("tenBenhNhan")  ,
                request.getParameter("ngayNhapVien")  ,
                request.getParameter("ngayRaVien")  ,
                request.getParameter("lyDoNhapVien")  ,
                new BenhAn(request.getParameter("maBenhAn")));

               Map<String,String> messenger = iBenhNhanService.edit(benhNhan);
               if(!messenger.isEmpty()){
                    request.setAttribute("benhNhan",benhNhan);
                  request.setAttribute("messenger",messenger.get("key"));
                  request.getRequestDispatcher("editbenhnhan.jsp").forward(request,response);
               }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getParameter("action");
    if (action == null){
        action = "";
    }
    switch (action){
        case "add":
            addShow(request,response);
            break;

        case "delete":
            delete(request,response);
            getAllBenhNhan(request,response);
            break;

        case "editshow":
            editShow(request,response);

            break;
        default:
            getAllBenhNhan(request,response);
            break;
    }

    }

    private void getAllBenhNhan(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<BenhNhan> benhNhanList = iBenhNhanService.getAll();
        request.setAttribute("benhNhanList", benhNhanList);
        request.getRequestDispatcher("benhnhan.jsp").forward(request,response);
    }

    private void addShow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("addbenhnhan.jsp").forward(request,response);
    }

    private  void delete (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String maBenhNhan = request.getParameter("maBenhNhan");
        iBenhNhanService.delete(maBenhNhan);

    }

    private  void editShow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String maBenhNhan = request.getParameter("maBenhNhan");
        BenhNhan benhNhan = iBenhNhanService.getById(maBenhNhan);
        request.setAttribute("benhNhan", benhNhan);
        request.getRequestDispatcher("editbenhnhan.jsp").forward(request,response);

    }

}
