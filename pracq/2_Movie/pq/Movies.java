package pq;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/*2.	WAP to store the information of Movies in a List which include name, 
 * language, releaseDate, director, producer, duration. 
Use Comparable interface to sort the movies according to their language.
Also use Comparator interface to sort the movies according to the director.
Public List<Movie> createMovieList()
Public void sortByLanguage(List<Movie> movieList)
Public void sortByDuration(List<Movie> movieList)
Public void SortByLanguageAndReleaseDate(List<Movie> movieList) If language is same then 
arrange by releasedate            
*/
public class Movies implements Comparable<Movies>{
	
	String name,language,director,producer;
	int duration;
	String releaseDate;
	
	public Movies() {}
	
	public Movies(String name, String language, String director, String producer, int duration, String releaseDate) {
		super();
		this.name = name;
		this.language = language;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int i) {
		this.duration = i;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		return "Movies [name=" + name + ", language=" + language + ", director=" + director + ", producer=" + producer
				+ ", duration=" + duration + ", releaseDate=" + releaseDate +"]";
	}//sdf.format(releaseDate)

	@Override
	public int compareTo(Movies o) {
		//return Comparator.comparing(Movies::getLanguage).compare(this,o);
		//return getLanguage().compareToIgnoreCase(o.getLanguage());
		return this.language.compareToIgnoreCase(o.language);
	}
	
	
	 

}
