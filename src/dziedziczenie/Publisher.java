package dziedziczenie;

import java.util.Objects;

public class Publisher {
    private int id;
    public String publisherName;

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
                return true;
        if (o == null || getClass() != o.getClass())
                return false;
        if(getClass() != o.getClass())
                return false;
        Publisher publisher = (Publisher) o;
                return id == publisher.id
                        && Objects.equals(publisherName, publisher.publisherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publisherName);
    }
}
