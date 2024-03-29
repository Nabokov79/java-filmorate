package ru.yandex.practicum.filmorate.storage.dao.dao;

import ru.yandex.practicum.filmorate.model.User;

import java.util.List;

public interface UserDao {
    User add(User user);

    void delete(User user);

    User update(User user);

    List<User> getAll();

    User getUserById(int id);
    void deleteUserById(int id);
}