package Feb21Hib.Entity;

import javax.persistence.Entity;

@Entity
public class BlogPost extends Publication{
	
	private String url;
	
	public BlogPost() {
		
	}
	public BlogPost(String title, String urls) {
		super(title);
		this.url = urls;
	}
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
