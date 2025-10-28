import java.util.ArrayList;

public class Movie {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addActor(String actor) {
        actors.add(actor);
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addActor("Joseph Gordon-Levitt");
        movie.addReview("Excellent!");
        movie.addReview("Mind-blowing!");
        movie.displayDetails();
    }
}
