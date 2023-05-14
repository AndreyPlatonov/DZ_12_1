public class Manager {

    private Poster[] posters = new Poster[0];
    private int resultLength;

    public Manager() {
        this.resultLength = 5;
    }

    public Manager(int length) {
        this.resultLength = length;
    }


    public void save(Poster item) {

        Poster[] tmp = new Poster[posters.length + 1];

        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = item;

        posters = tmp;
    }

    public Poster[] findAll() {

        return posters;
    }

    public Poster[] findLast() {

        int last;

        if (posters.length >= resultLength) {
            last = resultLength;
        } else {
            last = posters.length;
        }

        Poster[] tmp = new Poster[last];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[posters.length - 1 - i];
        }

        return tmp;
    }
}
