package database;

import java.util.List;

import model.ProListItem;

public interface ProListDao {

	public List<ProListItem> getAllItems();

	public ProListItem getItem(int id);

	public boolean addItem(ProListItem newItem);

	public boolean removeItem(int id);

}
