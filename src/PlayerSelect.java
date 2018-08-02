import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PlayerSelect extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String c = req.getParameter("country");
        FootballExpert footballExpert = new FootballExpert();
        List players = footballExpert.makeChoice(c);

        String thoughts = req.getParameter("text");
        ThoughtsExpert thoughtsExpert = new ThoughtsExpert();
        String resultThoughts = thoughtsExpert.getThoughts(thoughts);

        req.setAttribute("resultView",players);
        req.setAttribute("resultThoughts",resultThoughts);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");

        requestDispatcher.forward(req,resp);
    }
}