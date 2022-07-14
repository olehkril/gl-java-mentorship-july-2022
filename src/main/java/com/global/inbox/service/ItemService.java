package com.global.inbox.service;

import com.global.inbox.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ItemService {

    Item add(Item user);

    Optional<Item> getById(long id);

    Optional<Item> getByName(Item name);

    Item update(Item existed, Item newUser);

    void delete(Item user);

    Page<Item> getAll(Pageable pageable);
}
