import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    PosterManager man = new PosterManager();

    @BeforeEach
    public void setup() {
        man.addFilms("Bladshot");
        man.addFilms("Vpered");
        man.addFilms("Otel 'Belgrad'");
        man.addFilms("Dgentelmen");
        man.addFilms("Chelovek-nevedimka");
        man.addFilms("Trolly. Mirovoi tur");
    }

    @Test

    public void addFilms() {
        man.addFilms("Nomer odin");

        String[] expected = {"Bladshot", "Vpered", "Otel 'Belgrad'", "Dgentelmen", "Chelovek-nevedimka", "Trolly. Mirovoi tur", "Nomer odin"};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addFilmsAboveLimit() {
        man.addFilms("Nomer odin");
        man.addFilms("Film");

        String[] expected = {"Bladshot", "Vpered", "Otel 'Belgrad'", "Dgentelmen", "Chelovek-nevedimka", "Trolly. Mirovoi tur", "Nomer odin", "Film"};
        String[] actual = man.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllFilmsInReverseBelowLimit() {
        PosterManager man = new PosterManager(3);
        man.addFilms("Bladshot");
        man.addFilms("Vpered");
        man.addFilms("Otel 'Belgrad'");

        String[] expected = {"Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllFilmsInReverse() {
        PosterManager man = new PosterManager();
        man.addFilms("Bladshot");
        man.addFilms("Vpered");
        man.addFilms("Otel 'Belgrad'");
        man.addFilms("Dgentelmen");
        man.addFilms("Chelovek-nevedimka");

        String[] expected = {"Chelovek-nevedimka", "Dgentelmen", "Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void showAllFilmsInReverseLimit() {
        PosterManager man = new PosterManager(7);
        man.addFilms("Bladshot");
        man.addFilms("Vpered");
        man.addFilms("Otel 'Belgrad'");
        man.addFilms("Dgentelmen");
        man.addFilms("Chelovek-nevedimka");
        man.addFilms("Trolly. Mirovoi tur");
        man.addFilms("Nomer odin");


        String[] expected = {"Nomer odin", "Trolly. Mirovoi tur", "Chelovek-nevedimka", "Dgentelmen", "Otel 'Belgrad'", "Vpered", "Bladshot"};
        String[] actual = man.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
