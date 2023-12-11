import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager man = new PosterManager();

    @BeforeEach
    public void setup() {
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");
        man.setAddFilms("Dgentelmen");
        man.setAddFilms("Chelovek-nevedimka");
        man.setAddFilms("Trolly. Mirovoi tur");
    }

    @Test

    public void addFilms() {
        man.setAddFilms("Nomer odin");

        String[] expected = {"Bladshot", "Vpered", "Otel 'Belgrad'", "Dgentelmen", "Chelovek-nevedimka", "Trolly. Mirovoi tur", "Nomer odin"};
        String[] actual = man.getFindAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addFilmsAboveLimit() {
        man.setAddFilms("Nomer odin");
        man.setAddFilms("Film");

        String[] expected = {"Bladshot", "Vpered", "Otel 'Belgrad'", "Dgentelmen", "Chelovek-nevedimka", "Trolly. Mirovoi tur", "Nomer odin", "Film"};
        String[] actual = man.getFindAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void showAllFilmsInReverseBelowLimit2() {
        PosterManager man = new PosterManager(2);
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");


        String[] expected = {"Vpered","Bladshot"};
        String[] actual = man.setFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void showAllFilmsInReverseBelowLimit3() {
        PosterManager man = new PosterManager(3);
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");

        String[] expected = {"Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.setFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllFilmsInReverse() {
        PosterManager man = new PosterManager();
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");
        man.setAddFilms("Dgentelmen");
        man.setAddFilms("Chelovek-nevedimka");

        String[] expected = {"Chelovek-nevedimka", "Dgentelmen", "Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.setFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllFilmsInReverseLimit() {
        PosterManager man = new PosterManager(7);
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");
        man.setAddFilms("Dgentelmen");
        man.setAddFilms("Chelovek-nevedimka");
        man.setAddFilms("Trolly. Mirovoi tur");
        man.setAddFilms("Nomer odin");


        String[] expected = {"Nomer odin", "Trolly. Mirovoi tur", "Chelovek-nevedimka", "Dgentelmen", "Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.setFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
