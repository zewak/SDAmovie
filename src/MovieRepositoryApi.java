public interface MovieRepositoryApi {
    public int addMovie(String title, int yearOfRelease);
    public int deleteMovie(String title, int yearOfRelease);
    public void findAll();
    public int findByTitle(String findTitle);
}
