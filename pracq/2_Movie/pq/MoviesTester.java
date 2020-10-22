package pq;


import java.util.ArrayList;
import java.util.List;

public class MoviesTester {

	public static void main(String[] args) {

		MoviesOperations mo = new MoviesOperations();
		List<Movies> list = new ArrayList<Movies>(); 
		//public Movies(String name, String language, String director, String producer,
		//int duration, String releaseDate) {
		list.add(new Movies("Jaws","English","Steven","David",3,"01-12-1975"));
		list.add(new Movies("Zathura","enGlish","Josh","Scott",2,"30-02-2020"));
		list.add(new Movies("Natsamrat","Marathi","Mahesh","Nana",3,"21-01-2019"));
		list.add(new Movies("Uri","Hindi","Aditya","Ronnie",2,"12-01-2016"));
		list.add(new Movies("Shikara","Hindi","Vidhu","Vidhu",2,"08-11-2005"));
		
		System.out.println("\n                Original List 1            ");
		mo.display(list);
		
		System.out.println("\n***Sorting By Language***");
		mo.sortByLanguage(list);
		
		System.out.println("\n***Sorting By Director***");
		mo.sortByDirector(list);
	
		System.out.println("\n***Sort By Duration***");
		mo.sortByDuration(list);
		
		System.out.println("\n***Sort By Release Date and Language***");
		mo.SortByLanguageAndReleaseDate(list);
		
		
		List<Movies> list1 = new ArrayList<Movies>(); 
		list1.add(new Movies("Jaws","English","Steven","David",3,"01-12-1975"));
		list1.add(new Movies("Zathura","enGlish","Josh","Scott",2,"30-02-2020"));
		list1.add(new Movies("Natsamrat","English","Mahesh","Nana",3,"21-01-2019"));
		list1.add(new Movies("Uri","English","Aditya","Ronnie",2,"12-01-2016"));
		list1.add(new Movies("Shikara","English","Vidhu","Vidhu",2,"08-11-2005"));
		
		
		System.out.println("\n                Original List 2 : Same Language           ");
		mo.display(list1);
		
		System.out.println("\n***Sort By Release Date and Language***");
		mo.SortByLanguageAndReleaseDate(list1);

		
		System.out.println("Done!!!");
		
	}

}



/*
                Original List 1            
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Movies [name=Natsamrat, language=Marathi, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]
Movies [name=Uri, language=Hindi, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Shikara, language=Hindi, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]

***Sorting By Language***
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Movies [name=Uri, language=Hindi, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Shikara, language=Hindi, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]
Movies [name=Natsamrat, language=Marathi, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]

***Sorting By Director***
Movies [name=Uri, language=Hindi, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Movies [name=Natsamrat, language=Marathi, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]
Movies [name=Shikara, language=Hindi, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]

***Sort By Duration***
Movies [name=Uri, language=Hindi, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Movies [name=Shikara, language=Hindi, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]
Movies [name=Natsamrat, language=Marathi, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]

***Sort By Release Date and Language***
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Movies [name=Shikara, language=Hindi, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]
Movies [name=Uri, language=Hindi, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Natsamrat, language=Marathi, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]

                Original List 2 : Same Language           
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Movies [name=Natsamrat, language=English, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]
Movies [name=Uri, language=English, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Shikara, language=English, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]

***Sort By Release Date and Language***
Movies [name=Jaws, language=English, director=Steven, producer=David, duration=3, releaseDate=01-12-1975]
Movies [name=Shikara, language=English, director=Vidhu, producer=Vidhu, duration=2, releaseDate=08-11-2005]
Movies [name=Uri, language=English, director=Aditya, producer=Ronnie, duration=2, releaseDate=12-01-2016]
Movies [name=Natsamrat, language=English, director=Mahesh, producer=Nana, duration=3, releaseDate=21-01-2019]
Movies [name=Zathura, language=enGlish, director=Josh, producer=Scott, duration=2, releaseDate=30-02-2020]
Done!!!
*/
