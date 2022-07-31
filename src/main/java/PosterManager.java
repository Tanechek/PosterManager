public class PosterManager {

    private String[] films = new String[0];

    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        this.limit = 10;
    }

    public void addFilm (String filmName){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLastFilms() {
        int resultLength;
        if (films.length > limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}