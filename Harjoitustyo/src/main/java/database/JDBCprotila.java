package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ProListItem;

public class JDBCprotila implements ProListDao {

	database database;

	public JDBCprotila() {
		database = new database();
		createTable();

	}

	@Override
	public List<ProListItem> getAllItems() {
		List<ProListItem> items = new ArrayList<ProListItem>();
		Connection connection = database.connect();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM ProListItem");
			ResultSet results = statement.executeQuery();

			while (results.next()) {
				ProListItem item = new ProListItem();
				item.setId(results.getInt("id"));
				item.setTiheys(results.getDouble("tiheys"));
				item.setPaksuus(results.getDouble("paksuus"));
				item.setPituus(results.getDouble("pituus"));
				item.setLeveys(results.getDouble("leveys"));
				item.setPaino(results.getDouble("paino"));
				item.setGrain(results.getString("grain"));

				items.add(item);
			}
			results.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}

	@Override
	public boolean addItem(ProListItem newItem) {
		Connection connection = database.connect();
		try {
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO ProListItem(tiheys, grain, pituus, leveys, paino, paksuus) VALUES (?,?,?,?,?,?)");

			statement.setDouble(1, newItem.getTiheys());
			statement.setString(2, newItem.getGrain());
			statement.setDouble(3, newItem.getPituus());
			statement.setDouble(4, newItem.getLeveys());
			statement.setDouble(5, newItem.getPaino());
			statement.setDouble(6, newItem.getPaksuus());
			statement.executeUpdate();

			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void deleteAll() {
		try {
			Connection conn = database.connect();
			PreparedStatement p = conn.prepareStatement("DROP TABLE ProListItem");
			p.execute();
			conn.close();
			p.close();
			createTable();
		} catch (Exception e) {

		}
	}

	@Override
	public boolean removeItem(int id) {

		try {

			Connection connection = database.connect();
			PreparedStatement statement = connection.prepareStatement("DELETE FROM ProListItem WHERE id=?");
			statement.setInt(1, id);
			if (statement.executeUpdate() > 0) {
				return true;
			}

			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void createTable() {
		Connection connection = null;

		try {
			connection = database.connect();
			String sql = "CREATE TABLE IF NOT EXISTS ProListItem (id INTEGER PRIMARY KEY, tiheys TEXT, grain TEXT, "
					+ "paksuus TEXT, leveys TEXT, paino TEXT, pituus TEXT)";
			PreparedStatement s = connection.prepareStatement(sql);
			s.execute();
			connection.close();
		} catch (Exception e) {
			System.out.println("Virhe createTable");
		}
	}

	@Override
	public ProListItem getItem(int id) {
		// TODO Auto-generated method stub
		database database = new database();
		Connection connection = database.connect();
		try {
			PreparedStatement statement = connection.prepareStatement("SELECT * FROM ProListItem");
			ResultSet results = statement.executeQuery();

			for (ProListItem item : this.getAllItems()) {
				if (id == results.getInt((int) id)) {
					return item;
				}
			}
			results.close();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
