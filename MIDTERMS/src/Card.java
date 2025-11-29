import java.util.Objects;

public class Card {
    String name;

    public Card(int index) {
        String[] namelist = new String[10];
        namelist[0] = "The Fool";
        namelist[1] = "The Magician";
        namelist[2] = "The Star";
        namelist[3] = "The Empress";
        namelist[4] = "The Hierophant";
        namelist[5] = "Justice";
        namelist[6] = "The Hanged Man";
        namelist[7] = "The Moon";
        namelist[8] = "The World";
        namelist[9] = "Judgement";

        name = namelist[index];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "P{" + name + '}';
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}