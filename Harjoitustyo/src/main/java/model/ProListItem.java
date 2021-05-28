package model;

public class ProListItem {

	private int id;

	private double tiheys;
	private double paksuus;
	private double pituus;
	private double leveys;
	private double paino;
	private String grain;

	public ProListItem(int id, double tiheys, String grain, double pituus, double leveys, double paino,
			double paksuus) {
		super();
		this.id = id;
		this.tiheys = tiheys;
		this.paksuus = paksuus;
		this.pituus = pituus;
		this.leveys = leveys;
		this.paino = paino;
		this.grain = grain;
	}

	public ProListItem() {

	}

	public ProListItem(double tiheys, String grain, double pituus, double leveys, double paino, double paksuus) {
		super();

		this.tiheys = tiheys;
		this.paksuus = paksuus;
		this.pituus = pituus;
		this.leveys = leveys;
		this.paino = paino;
		this.grain = grain;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTiheys() {
		return tiheys;
	}

	public void setTiheys(double tiheys) {
		this.tiheys = tiheys;
	}

	public double getPaksuus() {
		return paksuus;
	}

	public void setPaksuus(double paksuus) {
		this.paksuus = paksuus;
	}

	public double getPituus() {
		return pituus;
	}

	public void setPituus(double pituus) {
		this.pituus = pituus;
	}

	public double getLeveys() {
		return leveys;
	}

	public void setLeveys(double leveys) {
		this.leveys = leveys;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	public String getGrain() {
		return grain;
	}

	public void setGrain(String grain) {
		this.grain = grain;
	}

	@Override
	public String toString() {
		return "ProListItem [id=" + id + ", tiheys=" + tiheys + ", paksuus=" + paksuus + ", pituus" + pituus
				+ ", leveys=" + leveys + ", paino=" + paino + ", grain=" + grain + "]";

	}

}
