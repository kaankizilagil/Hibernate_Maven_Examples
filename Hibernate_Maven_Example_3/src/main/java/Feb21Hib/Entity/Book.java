package Feb21Hib.Entity;

import javax.persistence.Entity;

@Entity
public class Book extends Publication {

	private int numpages;

	public Book() {
		
	}
	public Book(String title, int pagenums) {
		super(title);
		this.numpages = pagenums;
	}
	public int getNumpages() {
		return numpages;
	}

	public void setNumpages(int numpages) {
		this.numpages = numpages;
	}
}
