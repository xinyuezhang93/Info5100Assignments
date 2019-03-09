package Assignment6;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview>{
	
	// instance variables
    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    
 // methods
    public Mreview(){
        this.title="";
        this.ratings=new ArrayList<Integer>();
    }

    public Mreview(String title){
        this.title=title;
        this.ratings=new ArrayList<Integer>();
    }

    public Mreview(String title, int firstRating){
        this.title=title;
        this.ratings=new ArrayList<Integer>();
        this.ratings.add(firstRating);
    }

    // methods
    public void addRating(int rating){
        this.ratings.add(rating);
    }

    public double aveRating(){
        int sum=0;
        double ave;
        for(int rating : this.ratings) sum += rating;
        ave=(double)(sum/this.ratings.size());
        return ave;
    }


    public int compareTo(Mreview movie){
        if(this.title.equals(movie.title))
            return 0;
        else
            return this.title.compareTo(movie.title);
    }

    @Override
    public boolean equals(Object movie){
        return this.title.equals(((Mreview)movie).title);
    }

    public String getTitle(){
        return this.title;
    }

    public int numRatings(){
        return this.ratings.size();
    }

    @Override
    public String toString(){
        return this.title+", average "+ this.aveRating()+" out of " +this.numRatings()+" ratings";
    }
    
    
    public static void main (String[] args){
        Mreview movie=new Mreview("Kill Bill");
        movie.addRating(3);
        movie.addRating(4);
        movie.addRating(3);
        System.out.println(movie.toString()+"\nThe average ratings is "+ movie.aveRating());
    }
    
    
    
    
}