// @author Christopher Barfield


public class BackgroundImage implements Comparable<BackgroundImage>{
	private String imageFileName;
	private String title;
	private String description; 

	public BackgroundImage() {
		this.imageFileName= "imageFileName";
		this.title= "title";
		this.description= "description";		
	}
	
	public BackgroundImage(String imageFileName, String title, String description) {
		this.imageFileName= imageFileName;
		this.title= title;
		this.description= description;		
	}
	
	public Meme createMeme(BackgroundImage picture, String caption) {
		Meme m = new Meme();
		return m;
	}
	
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return title + " <" + description + ">"; 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BackgroundImage other = (BackgroundImage) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (imageFileName == null) {
			if (other.imageFileName != null)
				return false;
		} else if (!imageFileName.equals(other.imageFileName))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public int compareTo(BackgroundImage o1) {
		//Sort by filename
		
		int file = this.getImageFileName().compareTo(o1.getImageFileName());
		if (file != 0)
			return file;
		
		//Sort by title
		
		int title = this.getTitle().compareTo(o1.getTitle());
		if (title != 0)
			return title;
		
		//Sort by description
		
		int desc = this.getDescription().compareTo(o1.getDescription());
		return desc;
	}
}
