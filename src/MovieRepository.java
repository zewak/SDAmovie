public class MovieRepository implements MovieRepositoryApi{

    @Override
    public int addMovie(String title, int yearOfRelease) {
       // Main.movies[1] = new Movie("Coś", 1980); test OK
        for (int i = 0; i < Main.movies.length; i++) {
            if (Main.movies[i] == null) {
                Main.movies[i] = new Movie(title, yearOfRelease);
            }
            return i;
        }

        return -1;
    }

    @Override
    public int deleteMovie(String title, int yearOfRelease) {
        return 0;
    }

    @Override
    public void findAll() {

    }

    @Override
    public int findByTitle(String findTitle) {
        return 0;
    }
}
