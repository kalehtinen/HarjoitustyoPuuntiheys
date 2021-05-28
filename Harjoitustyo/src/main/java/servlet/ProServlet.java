package servlet;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.JDBCprotila;
import model.ProListItem;

@WebServlet("/pro")
public class ProServlet extends HttpServlet {

	JDBCprotila database = new JDBCprotila();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			DecimalFormat des = new DecimalFormat("0.00");

			String paksuus = req.getParameter("paksuus");
			String pituus = req.getParameter("pituus");
			String leveys = req.getParameter("leveys");
			String paino = req.getParameter("paino");
			String grain = req.getParameter("grain");

			// String muutettava Doubliksi, jotta voidaan laskea

			double paksuusDouble = Double.parseDouble(paksuus);
			double pituusDouble = Double.parseDouble(pituus);
			double leveysDouble = Double.parseDouble(leveys);
			double painoDouble = Double.parseDouble(paino);

			// Lasketaan puun tiheys ja tilavuus

			double tilavuusmm3 = (paksuusDouble * pituusDouble * leveysDouble);
			double tiheys = (painoDouble / 1000.0) / (tilavuusmm3 / 1000000000.0);

			ProListItem item = new ProListItem(tiheys, grain, paksuusDouble, pituusDouble, leveysDouble, painoDouble);

			database.addItem(item);

			// Tiedot välitetään selaimelle

			req.setAttribute("tiheys", des.format(tiheys));

			// tiedot lähetetään index.jsp sivulle
			req.setAttribute("items", database.getAllItems());
			req.getRequestDispatcher("/pro.jsp").forward(req, resp);

		} catch (Exception e) {
			req.getRequestDispatcher("/pro.jsp").forward(req, resp);
		}

	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		try {
			String paksuus = req.getParameter("paksuus");
			String pituus = req.getParameter("pituus");
			String leveys = req.getParameter("leveys");
			String paino = req.getParameter("paino");
			String grain = req.getParameter("grain");
			double tiheys = Double.valueOf(req.getParameter("tiheys"));

			double paksuusDouble = Double.parseDouble(paksuus);
			double pituusDouble = Double.parseDouble(pituus);
			double leveysDouble = Double.parseDouble(leveys);
			double painoDouble = Double.parseDouble(paino);

			ProListItem item = new ProListItem(tiheys, grain, paksuusDouble, pituusDouble, leveysDouble, painoDouble);
			database.addItem(item);

		} catch (Exception e) {
			e.printStackTrace();
		}

		resp.sendRedirect("/pro.jsp");

	}
}
