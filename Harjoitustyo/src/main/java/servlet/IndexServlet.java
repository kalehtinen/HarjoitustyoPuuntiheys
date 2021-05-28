package servlet;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/laske")
public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			DecimalFormat des = new DecimalFormat("0.00");

			// Otetaan index.jsp:stä samat arvot
			String paksuus = req.getParameter("paksuus");
			String pituus = req.getParameter("pituus");
			String leveys = req.getParameter("leveys");
			String paino = req.getParameter("paino");

			// String muutettava Doubliksi, jotta voidaan laskea

			double paksuusDouble = Double.parseDouble(paksuus);
			double pituusDouble = Double.parseDouble(pituus);
			double leveysDouble = Double.parseDouble(leveys);
			double painoDouble = Double.parseDouble(paino);

			// Lasketaan puun tiheys ja tilavuus

			double tilavuusmm3 = (paksuusDouble * pituusDouble * leveysDouble);
			double tiheys = (painoDouble / 1000.0) / (tilavuusmm3 / 1000000000.0);

			// Tiedot välitetään selaimelle

			req.setAttribute("tiheys", des.format(tiheys));

			// tiedot lähetetään index.jsp sivulle

			req.getRequestDispatcher("/index.jsp").forward(req, resp);

		} catch (Exception e) {

			req.getRequestDispatcher("/index.jsp").forward(req, resp);

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Otetaan index.jsp:stä samat arvot eli tässä tapauksessa salasana

		String salasana = req.getParameter("salasana");
		if (salasana.equals("123")) {
			// jos salasana on oikein tiedot lähetetään pro.jsp sivulle
			req.getRequestDispatcher("/pro.jsp").forward(req, resp);
		} else {
			// jos salasana on väärin Tiedot välitetään takaisin kirjaudu sivulle
			req.getRequestDispatcher("/kirjaudu.jsp").forward(req, resp);
		}

	}
}
