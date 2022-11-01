import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class counterServlet extends HttpServlet {
    private int count;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        count += 1;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        if(req.getParameter("reset") != null && req.getParameter("reset").equals(true)){
            count = 0;
        }

        out.println("Count: "+ count);
    }
}
