package academy.core;

import java.util.List;
import java.util.Objects;

/*Класс, представляющий заявку на грант.*/

public class GrantApplication {
    private final String id; // Уникальный идентификатор заявки
    private final String ownerId; // Идентификатор участника, подавшего заявку
    private final String title; // Название заявки
    private final String description; // Описание заявки
    private final List<String> directions; // Список направлений, к которым относится заявка
    private final long requestedAmount; // Запрашиваемая сумма гранта

    public GrantApplication(String id, String ownerId, String title, String description, List<String> directions, long requestedAmount) {
        this.id = id;
        this.ownerId = ownerId;
        this.title = title;
        this.description = description;
        this.directions = directions; //Пока будем хранить направления как список строк в заявке, без отдельного перечисления
        this.requestedAmount = requestedAmount;
    }

    public String getId() {
        return id;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getDirections() {
        return directions;
    }

    public long getRequestedAmount() {
        return requestedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrantApplication that = (GrantApplication) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "GrantApplication{" +
                "id='" + id + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", directions=" + directions +
                ", requestedAmount=" + requestedAmount +
                '}';
    }
}
