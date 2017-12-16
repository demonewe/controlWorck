import ru.mail.demonewe.dmitry.MyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    private MyService myService = new MyService();
    @java.lang.Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String hello = "Hello world from servlet" + "\n";
        System.out.println(hello);
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("D:\\gitControl\\multy\\web\\src\\main\\resources\\file.txt");
            fileWriter.write(myService.myRepository() +"\n" + hello);
        }finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }
}