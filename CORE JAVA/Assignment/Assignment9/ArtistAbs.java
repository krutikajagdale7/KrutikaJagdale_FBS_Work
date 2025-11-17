
abstract class Artist {

	 	String name;
	    int age;
	    String nationality;
	    int experience;
	    Artist() {
	        System.out.println("Artist Default Constructor Called");
	        this.name = "Unknown";
	        this.age = 25;
	        this.nationality = "Indian";
	        this.experience = 1;
	    }

	    Artist(String name, int age, String nationality, int experience) {
	        System.out.println("Artist Parameterized Constructor Called");
	        this.name = name;
	        this.age = age;
	        this.nationality = nationality;
	        this.experience = experience;
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public int getExperience() {
			return experience;
		}

		public void setExperience(int experience) {
			this.experience = experience;
		}

		abstract void perform();
	    void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Nationality: " + nationality);
	        System.out.println("Experience: " + experience + " years");
	    }
public String toString(){
	return "\n Name is:"+this.name+" Age is :"+this.age+"Nationality is:"+this.nationality+" Experinece"+this.experience;

}
	

}//Artist end here
class Painter extends Artist {
    String paintingStyle;
    int numberOfPaintings;
    String medium;
    
    Painter() {
        super();
        System.out.println("Painter Default Constructor Called");
        this.paintingStyle = "Abstract";
        this.numberOfPaintings = 10;
        this.medium = "Oil on Canvas";
    }

    Painter(String name, int age, String nationality, int experience,
            String style, int count, String medium) {

        super(name, age, nationality, experience);
        System.out.println("Painter Parameterized Constructor Called");
        this.paintingStyle = style;
        this.numberOfPaintings = count;
        this.medium = medium;
    }

   
    public String getPaintingStyle() {
		return paintingStyle;
	}

	public void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	public int getNumberOfPaintings() {
		return numberOfPaintings;
	}

	public void setNumberOfPaintings(int numberOfPaintings) {
		this.numberOfPaintings = numberOfPaintings;
	}

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	void perform() {
        System.out.println(name + " is painting a beautiful artwork.");
    }

    void display() {
        super.display();
        System.out.println("Painting Style: " + paintingStyle);
        System.out.println("Number of Paintings: " + numberOfPaintings);
        System.out.println("Medium: " + medium);
    }

}//Painter end here
class Singer extends Artist {
    String genre;
    int albumsReleased;
    String vocalType;
    boolean playbackSinger;
    Singer() {
        super();
        System.out.println("Singer Default Constructor Called");
        this.genre = "Pop";
        this.albumsReleased = 3;
        this.vocalType = "Soprano";
        this.playbackSinger = true;
    }

    Singer(String name, int age, String nationality, int experience,
           String genre, int albums, String vocalType, boolean playback) {

        super(name, age, nationality, experience);
        System.out.println("Singer Parameterized Constructor Called");
        this.genre = genre;
        this.albumsReleased = albums;
        this.vocalType = vocalType;
        this.playbackSinger = playback;
    }

    
    void perform() {
        System.out.println(name + " is singing a melodious song.");
    }

   
    void display() {
        super.display();
        System.out.println("Genre: " + genre);
        System.out.println("Albums Released: " + albumsReleased);
        System.out.println("Vocal Type: " + vocalType);
        System.out.println("Playback Singer: " + playbackSinger);
    }
    
}
//Singer end here
class Actor extends Artist {
    String actingStyle;
    int moviesDone;
    String startMovie;
    String industry;
    Actor() {
        super();
        System.out.println("Actor Default Constructor Called");
        this.actingStyle = "Method Acting";
        this.moviesDone = 5;
        this.startMovie = "Debut Film";
        this.industry = "Bollywood";
    }

    Actor(String name, int age, String nationality, int experience,
          String style, int movies, String start, String industry) {

        super(name, age, nationality, experience);
        System.out.println("Actor Parameterized Constructor Called");
        this.actingStyle = style;
        this.moviesDone = movies;
        this.startMovie = start;
                   this.industry = industry;
    }

    
    void perform() {
        System.out.println(name + " is acting in a blockbuster movie.");
    }

    
    void display() {
        super.display();
        System.out.println("Acting Style: " + actingStyle);
        System.out.println("Movies Done: " + moviesDone);
        System.out.println("1st Movie: " + startMovie);
        System.out.println("Industry: " + industry);
    }
}
//Actor end here
class ArtistTest{
	
	public static void main(String[] args) {
		Artist a;

        System.out.println("\n--- Painter Object ---");
        a = new Painter("Ravi", 30, "Indian", 8, "Watercolor", 40, "Watercolor on Paper");
        a.perform();
        a.display();

        System.out.println("\n--- Singer Object ---");
        a = new Singer("Arijit", 35, "Indian", 12, "Romantic", 12, "Tenor", true);
        a.perform();
        a.display();

        System.out.println("\n--- Actor Object ---");
        a = new Actor("Hrithik", 40, "Indian", 15, "Action", 25, "Kaho Na Pyaar Hai", "Bollywood");
        a.perform();
        a.display();
	 System.out.println(a);
	System.out.println(a.toString());
	
   
	}//main end here	
}//ArtistTest end here

