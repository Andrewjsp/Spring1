package com.epam.repository;

import com.epam.model.MyNew;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepo extends CrudRepository<MyNew,Long> {
List<MyNew> findAllBy();
MyNew save(MyNew myNew);
}
