package pq;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.Scanner;


public class MoviesOperations {

	// Create
	/*public List<Movies> createMovieList() {
		ArrayList<Movies> mov = new ArrayList<Movies>();
		Scanner sc = new Scanner(System.in);
		int mn;
		

		System.out.println("Enter total Number of movies:");
		mn = sc.nextInt();

		for(int i=0;i<mn;i++) {
			System.out.println("Enter movie " + (i+1) );
			Movies movobj = new Movies();
			System.out.print("Enter Movie Name: ");
			movobj.setName(sc.next());
			System.out.print("Enter Movie Language: ");
			movobj.setLanguage(sc.next());
			System.out.print("Enter Director Name: ");
			movobj.setDirector(sc.next());
			System.out.print("Enter Producer Name: ");
			movobj.setProducer(sc.next());
			System.out.print("Enter Duration: ");
			movobj.setDuration(sc.nextInt());
			System.out.print("Enter Date: ");
			movobj.setReleaseDate(sc.next());
			/*SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			Date date;

			try {
				System.out.print("Enter Date: ");
				d = sc.next();
				date = sdf.parse(d);
				movobj.setReleaseDate(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


			mov.add(movobj);
		}

		return mov;
	}
*/
	//display
	public void display(List<Movies> m) {
		for(Movies it : m ) {
			System.out.println(it.toString());
		}
	}


	// Language comparable
	public void sortByLanguage(List<Movies> movieList) {
		Collections.sort(movieList);
		movieList.stream().map(s->s.toString()+"\n").forEach(System.out::print);
	}

	// Director comparator
	public void sortByDirector(List<Movies> movieList) {
		class SortDirec implements Comparator<Movies>{

			@Override
			public int compare(Movies o1, Movies o2) {

				return o1.getDirector().compareToIgnoreCase(o2.getDirector());
			}

		}

		movieList.sort(new SortDirec());
		for(Movies m : movieList) {
			System.out.println(m.toString());
		}
	}

	// Duration 
	public void sortByDuration(List<Movies> movieList) {
		class SortDuration implements Comparator<Movies>{

			@Override
			public int compare(Movies arg0, Movies arg1) {
				if(arg0.getDuration() < arg1.getDuration())
					return -1;
				else if(arg0.getDuration() > arg1.getDuration())
					return 1;
				else
				return 0 ;
			}

		}

		movieList.sort(new SortDuration());
		for(Movies m : movieList) {
			System.out.println(m.toString());
		}

	}

	// Language and Release Date
	public void SortByLanguageAndReleaseDate(List<Movies> movieList) {
		// Anonymous class
		Comparator<Movies> sortLangRelease = new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				int i = o1.getLanguage().compareToIgnoreCase(o2.getLanguage());
				// same lang
				if(i==0) {
					i = o1.getReleaseDate().compareTo(o2.getReleaseDate());
				}

				return i;
			}
		};

		movieList.sort(sortLangRelease);
		for(Movies m : movieList) {
			System.out.println(m.toString());
		}
	/*	for(int i=movieList.size()-1;i>0;i--) {
			System.out.println(movieList.get(i).toString());
		}*/

	}



}



