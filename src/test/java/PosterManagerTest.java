import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    String [] films = new String[]{
            "Бладшот",
            "Вперёд",
            "Отель Белград",
            "Джентльмены",
            "Человек-невидимка",
            "Тролли. Мировой тур",
            "Номер один"};

    @Test
    public void shouldAddFilm(){
        PosterManager posterManager = new PosterManager();
        posterManager.addFilm(films[0]);
        String addedFilm = posterManager.findAll()[0];
        Assertions.assertEquals(films[0], addedFilm);
    }

    @Test
    public void shouldChangeLimit(){
        PosterManager posterManager = new PosterManager(3);
        posterManager.addFilm(films[0]);
        posterManager.addFilm(films[1]);
        posterManager.addFilm(films[2]);
        posterManager.addFilm(films[3]);
        String[] lastFilms = posterManager.findLastFilms();

        Assertions.assertEquals(3, lastFilms.length);
    }

    @Test
    public void shouldFindFilmsLessLimit(){
        PosterManager posterManager = new PosterManager(5);
        posterManager.addFilm(films[0]);
        posterManager.addFilm(films[1]);
        posterManager.addFilm(films[2]);
        posterManager.addFilm(films[3]);
        String[] lastFilms = posterManager.findLastFilms();

        Assertions.assertEquals(4, lastFilms.length);
    }
}
