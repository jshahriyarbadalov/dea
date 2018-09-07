package az.dea.db;

import az.dea.beans.User;

import java.util.List;

public class UserRepository extends Connector implements Repository<User> {
    @Override
    public User save(User o) {
        return null;
    }

    @Override
    public User find(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public boolean remove(Long id) {
        return false;
    }
}
