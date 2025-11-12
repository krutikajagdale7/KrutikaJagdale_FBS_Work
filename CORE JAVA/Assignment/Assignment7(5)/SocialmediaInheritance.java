
class SocialMediaAccount {

String UserName;
String Email;
boolean IsPublic;
boolean IsVerified;
String CountryOrigin;
int NoOfPost;
int Like;
int Comment;
int CreatedNoOfImpression;
String CreatedAt;

SocialMediaAccount(){
	
	 System.out.println("SocialMediaAccount Default Constructor ");
	 this.UserName = "abc";
	 this.Email = "a@gmail.com";
	 this.IsPublic = true;
	 this.IsVerified = false;
	 this.CountryOrigin = "India";
	 this.NoOfPost = 50;
	 this.Like = 10000;
	 this.Comment = 400;
	 this.CreatedNoOfImpression = 300;
	 this.CreatedAt = "12-Nov-2019";
	
}
	
SocialMediaAccount(String UN, String E, boolean P,boolean V,String Co, int Po,int L, int C,int CI,String CA ){
	
	 
	 System.out.println("SocialMediaAccount Parameterized Constructor ");
	 this.UserName = UN;
	 this.Email = E;
	 this.IsPublic = P;
	 this.IsVerified = V;
	 this.CountryOrigin =Co;
	 this.NoOfPost = Po;
	 this.Like = L;
	 this.Comment = C;
	 this.CreatedNoOfImpression = CI;
	 this.CreatedAt = CA;
	
}

public String getUserName() {
	return UserName;
}

public void setUserName(String userName) {
	UserName = userName;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public boolean isIsPublic() {
	return IsPublic;
}

public void setIsPublic(boolean isPublic) {
	IsPublic = isPublic;
}

public boolean isIsVerified() {
	return IsVerified;
}

public void setIsVerified(boolean isVerified) {
	IsVerified = isVerified;
}

public String getCountryOrigin() {
	return CountryOrigin;
}

public void setCountryOrigin(String countryOrigin) {
	CountryOrigin = countryOrigin;
}

public int getNoOfPost() {
	return NoOfPost;
}

public void setNoOfPost(int noOfPost) {
	NoOfPost = noOfPost;
}

public int getLike() {
	return Like;
}

public void setLike(int like) {
	Like = like;
}

public int getComment() {
	return Comment;
}

public void setComment(int comment) {
	Comment = comment;
}

public int getCreatedNoOfImpression() {
	return CreatedNoOfImpression;
}

public void setCreatedNoOfImpression(int createdNoOfImpression) {
	CreatedNoOfImpression = createdNoOfImpression;
}

public String getCreatedAt() {
	return CreatedAt;
}

public void setCreatedAt(String createdAt) {
	CreatedAt = createdAt;
}
void Display() {
	
	
	
	
	System.out.println("UserName is:"+this.UserName);
	System.out.println("Email is:"+this.Email);
	System.out.println("IsPublic "+this.IsPublic);
	System.out.println("ISVerified is:"+this.IsVerified);
	System.out.println(" CountryOrigin is:"+this.CountryOrigin);
	System.out.println("NoOfPost "+this.NoOfPost);
	System.out.println("Like "+this.Like);
	System.out.println("Comment is:"+this.Comment);
	System.out.println(" CreatedNoOfImpression is:"+this.CreatedNoOfImpression);
	System.out.println("CreatedAt "+this.CreatedAt);
	
	
	
}
	
}//SocialMediaAccount end here
class Instagram extends SocialMediaAccount{
	
	int NoOfFollowing;
	int NoOfFollowers;
	int NoOfHightlights;
	int NoOfPostArchive;
	int NoOfStoryArchive;
	int NoOfAudioSave;
	
	Instagram(){
		
		super();
		 System.out.println("Instagram Default Constructor ");
		 this.NoOfFollowing = 4000;
		 this.NoOfFollowers = 6000;
		 this.NoOfHightlights = 60;
		 this.NoOfPostArchive = 70;
		 this.NoOfStoryArchive = 50;
		 this.NoOfAudioSave = 30;
	}
	
Instagram(String UN, String E, boolean P,boolean V,String Co, int Po,int L, int C,int CI,String CA,int FO, int FR, int HI,int PA, int SA, int AS){
		
		super(UN,E,P,V,Co,Po,L,C,CI,CA);
		 System.out.println("Instagram Parameterized Constructor ");
		 this.NoOfFollowing = FO;
		 this.NoOfFollowers = FR;
		 this.NoOfHightlights = HI;
		 this.NoOfPostArchive = PA;
		 this.NoOfStoryArchive = SA;
		 this.NoOfAudioSave = AS;
	}

public int getNoOfFollowing() {
	return NoOfFollowing;
}

public void setNoOfFollowing(int noOfFollowing) {
	NoOfFollowing = noOfFollowing;
}

public int getNoOfFollowers() {
	return NoOfFollowers;
}

public void setNoOfFollowers(int noOfFollowers) {
	NoOfFollowers = noOfFollowers;
}

public int getNoOfHightlights() {
	return NoOfHightlights;
}

public void setNoOfHightlights(int noOfHightlights) {
	NoOfHightlights = noOfHightlights;
}

public int getNoOfPostArchive() {
	return NoOfPostArchive;
}

public void setNoOfPostArchive(int noOfPostArchive) {
	NoOfPostArchive = noOfPostArchive;
}

public int getNoOfStoryArchive() {
	return NoOfStoryArchive;
}

public void setNoOfStoryArchive(int noOfStoryArchive) {
	NoOfStoryArchive = noOfStoryArchive;
}

public int getNoOfAudioSave() {
	return NoOfAudioSave;
}

public void setNoOfAudioSave(int noOfAudioSave) {
	NoOfAudioSave = noOfAudioSave;
}
	
	
void Display()
	{
		super.Display();
	System.out.println(" NoOfFollowing is:"+this.NoOfFollowing);
	System.out.println("NoOfFollowers "+this.NoOfFollowers);
	System.out.println("NoOfHightlights "+this.NoOfHightlights);
	System.out.println("NoOfPostArchive is:"+this.NoOfPostArchive);
	System.out.println(" NoOfStoryArchive is:"+this.NoOfStoryArchive);
	System.out.println("NoOfAudioSave "+this.NoOfAudioSave);
		
		
		
	}
}//Instagram end here
class Linkdien extends SocialMediaAccount{
	int NoOFConnection;
	int NoOfProfileview;
	int NoOfJobsApplied;
	
	Linkdien(){
		
		super();
		 System.out.println("Linkdien Default Constructor ");
		this.NoOFConnection = 780;
		this.NoOfProfileview = 500;
		this.NoOfJobsApplied = 50;
		
	}
	Linkdien(String UN, String E, boolean P,boolean V,String Co, int Po,int L, int C,int CI,String CA,int NC,int NPV, int NJA){
		
		super();
		System.out.println("Linkdien Parametrized Constructor ");
		this.NoOFConnection = NC;
		this.NoOfProfileview = NPV;
		this.NoOfJobsApplied = NJA;
		
	}
	public int getNoOFConnection() {
		return NoOFConnection;
	}
	public void setNoOFConnection(int noOFConnection) {
		NoOFConnection = noOFConnection;
	}
	public int getNoOfProfileview() {
		return NoOfProfileview;
	}
	public void setNoOfProfileview(int noOfProfileview) {
		NoOfProfileview = noOfProfileview;
	}
	public int getNoOfJobsApplied() {
		return NoOfJobsApplied;
	}
	public void setNoOfJobsApplied(int noOfJobsApplied) {
		NoOfJobsApplied = noOfJobsApplied;
	}
	void Display() {
		
		
		super.Display();
		System.out.println("NoOFConnection is:"+this.NoOFConnection);
		System.out.println(" NoOfProfileview is:"+this.NoOfProfileview);
		System.out.println("NoOfJobsApplied "+this.NoOfJobsApplied);
		
		
	}
	
	
	
	
	
}//Linkdien end here
class Youtube extends SocialMediaAccount
{
	int NoOfSubscription;
	double WatchTime;
	boolean isMonetized;
	double estimatedRevenue;
	
	Youtube(){
		 super();
		 System.out.println("Youtube Default Constructor ");
		 this.NoOfSubscription = 400;
		 this.WatchTime = 20;
		 this.isMonetized = true;
		 this.estimatedRevenue = 50.9;
	}
	
	Youtube(String UN, String E, boolean P,boolean V,String Co, int Po,int L, int C,int CI,String CA,int NS, double WT,boolean MO,double ER ){
		super(UN,E,P,V,Co,Po,L,C,CI,CA);

		 System.out.println("Youtube Parametrized Constructor ");
		 this.NoOfSubscription = NS;
		 this.WatchTime = WT;
		 this.isMonetized = MO;
		 this.estimatedRevenue = ER;
	}

	public int getNoOfSubscription() {
		return NoOfSubscription;
	}

	public void setNoOfSubscription(int noOfSubscription) {
		NoOfSubscription = noOfSubscription;
	}

	public double getWatchTime() {
		return WatchTime;
	}

	public void setWatchTime(double watchTime) {
		WatchTime = watchTime;
	}

	public boolean isMonetized() {
		return isMonetized;
	}

	public void setMonetized(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}

	public double getEstimatedRevenue() {
		return estimatedRevenue;
	}

	public void setEstimatedRevenue(double estimatedRevenue) {
		this.estimatedRevenue = estimatedRevenue;
	}
	void Display() {
		
		
		super.Display();
		System.out.println("NoOfSubscription is:"+this.NoOfSubscription);
		System.out.println("WatchTime is:"+this.WatchTime);
		System.out.println(" isMonetized is:"+this.isMonetized);
		System.out.println("estimatedRevenue "+this.estimatedRevenue);

		
		
	}

}//Youtube end here
class TestMedia{
	public static void main (String [] args) {
		SocialMediaAccount S1 = new SocialMediaAccount();
		S1.Display();
		SocialMediaAccount S2 = new SocialMediaAccount("KKK","k@gmail.com",true,false,"India",60,8000,500,200,"23-No-2020");
		S2.Display();
		
		Instagram I1 = new Instagram();
		I1.Display();
		Instagram I2 = new Instagram("lll","l@gmail.com",true,false,"India",70,9000,700,100,"01-No-2020",100,200,300,100,80,70);
		I2.Display();
		
		Linkdien L1 = new Linkdien();
		L1.Display();
		Linkdien L2 = new Linkdien("jjj","j@gmail.com",true,false,"India",70,9000,700,100,"01-No-2021",500,560,60);
		L2.Display();
		
		Youtube Y1 = new Youtube();
		Y1.Display();
		Youtube Y2 = new Youtube("VVV","v@gmail.com",true,false,"India",70,9000,700,100,"01-No-2015",100,120.00,true,40.00);
		Y2.Display();
		
	}
	
	
	
	
}//media end here