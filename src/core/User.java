package core;

import java.util.Objects;

/*Класс, представляющий базового пользователя (участника или эксперта).*/
public class User {
    private final String id; // Уникальный идентификатор пользователя
    private final String fullName; // ФИО пользователя
    private final String login; // Логин пользователя
    private final String password; // Пароль пользователя

    public User(String id, String fullName, String login, String password) {
        this.id = id;
        this.fullName = fullName;
        this.login = login;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(login, user.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
