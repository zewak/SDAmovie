public class Main {

    public static Movie[] movies = new Movie[5];
    public static void main(String[] args) {
        System.out.println("Movies");

        Movie moveA1 = new Movie("Film1", 1988);

        movies[0] = new Movie("aaa",2001);
        System.out.println(movies[0]);
        // działa :)

        System.out.println("Dodajemy");
        MovieRepository.addMovie2("bbb",2002);
        MovieRepository.addMovie2("ccc",2003);
        // też działa ale na addMovie2 który jest public static i jest w klasie MovieRepository
        // a nie w interfejsie MovieRepositoryApi

        System.out.println(movies[0]);
        System.out.println(movies[1]);
        System.out.println(movies[2]);

    }

}


