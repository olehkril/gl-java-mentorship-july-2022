package com.global.inbox.service.impl;

import com.global.inbox.model.Item;
import com.global.inbox.service.ItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ItemServiceImpl implements ItemService {



    @Override
    public Item add(Item user) {
        return null;
    }

    @Override
    public Optional<Item> getById(long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Item> getByName(Item name) {
        return Optional.empty();
    }

    @Override
    public Item update(Item existed, Item newUser) {
        return null;
    }

    @Override
    public void delete(Item user) {

    }

    @Override
    public Page<Item> getAll(Pageable pageable) {
        return null;
    }
}
