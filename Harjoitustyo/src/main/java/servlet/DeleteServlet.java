package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.JDBCprotila;
import model.ProListItem;

@WebServlet("/pro.jsp/Deleteid")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		int id = Integer.valueOf(req.getParameter("id"));

		JDBCprotila tila = new JDBCprotila();

		tila.removeItem(id);
		List<ProListItem> list = tila.getAllItems();
		tila.deleteAll();
		for (ProListItem i : list) {
			tila.addItem(i);
		}

		resp.sendRedirect("/pro.jsp");
	}
}
