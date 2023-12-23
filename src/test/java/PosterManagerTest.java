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

    public void showAllFilmsInReverseLimit() {
        PosterManager man = new PosterManager(3);
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");

        String[] expected = {"Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.getFindLast();
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
        String[] actual = man.getFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllFilmsInBelowLimit() {
        PosterManager man = new PosterManager(8);
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");
        man.setAddFilms("Dgentelmen");


        String[] expected = {"Dgentelmen", "Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.getFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void showAllFilmsInReverseAboveLimit() {
        PosterManager man = new PosterManager(5);
        man.setAddFilms("Bladshot");
        man.setAddFilms("Vpered");
        man.setAddFilms("Otel 'Belgrad'");
        man.setAddFilms("Dgentelmen");
        man.setAddFilms("Chelovek-nevedimka");
        man.setAddFilms("Trolly. Mirovoi tur");

        String[] expected = {"Trolly. Mirovoi tur","Chelovek-nevedimka","Dgentelmen", "Otel 'Belgrad'", "Vpered"};
        String[] actual = man.getFindLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
