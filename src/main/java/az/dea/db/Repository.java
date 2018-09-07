package az.dea.db;

import java.util.List;

public interface Repository<O> {
    O save (O o);
    O find(Long id);
    List<O> findAll();
    boolean remove(Long id);
}
