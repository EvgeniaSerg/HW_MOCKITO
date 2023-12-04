public class PosterManager {
    int numberOfFilms;
    private String[] films = new String[0];

    public PosterManager() {
        this.numberOfFilms = 5;
    }

    public PosterManager(int numberOfFilms) {
        this.numberOfFilms = 7;
    }


    public void addFilms(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }
    public String[] findLast() {
        int resultLength;
        if (films.length < numberOfFilms) {
            resultLength = films.length;
        } else {
            resultLength = this.numberOfFilms;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
