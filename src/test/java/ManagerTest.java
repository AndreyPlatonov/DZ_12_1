import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Poster item1 = new Poster(1, "Бладшот", "боевик");
    Poster item2 = new Poster(2, "Вперед", "мультфильм");
    Poster item3 = new Poster(3, "Отель Белград", "комедия");
    Poster item4 = new Poster(4, "Джентельмены", "боевик");
    Poster item5 = new Poster(5, "Человек-Невидимка", "ужасы");
    Poster item6 = new Poster(16, "Тролли.Мировой тур", "мультфильм");
    Poster item7 = new Poster(23, "Номер один", "комедия");

    @Test
    public void saveTest() {
        Manager repo = new Manager();
        repo.save(item1);
        repo.save(item4);
        repo.save(item5);

        Poster[] expected = {item1, item4, item5};
        Poster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test

    public void findLastTestUnder() {
        Manager repo = new Manager(3);
        repo.save(item1);
        repo.save(item4);
        repo.save(item5);
        repo.save(item3);
        repo.save(item2);

        Poster[] expected = {item2, item3, item5};
        Poster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestOver() {
        Manager repo = new Manager(5);
        repo.save(item1);
        repo.save(item4);
        repo.save(item5);


        Poster[] expected = {item5, item4, item1};
        Poster[] actual = repo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
