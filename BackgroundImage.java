//Christopher Barfield 

public class BackgroundImage {
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
	public static void main(String[] args) {
		//Constructors
		BackgroundImage back1 = new BackgroundImage("File1", "Chris Stays Inside", "Christopher wastes time playing his playstation 5 instead of being productive");
		BackgroundImage back2 = new BackgroundImage("File2","Chris Goes Outside","Christopher takes his talents outside to stay in shape");
		// toString methods
		System.out.println(back1.toString());
		System.out.println(back2.toString());
		// equals methods
		System.out.println(back1.equals(back1));
		System.out.println(back2.equals(back1));
		System.out.println(back2.equals(back2));
	}

}