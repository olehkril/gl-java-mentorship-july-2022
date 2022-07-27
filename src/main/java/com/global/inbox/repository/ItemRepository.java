package com.global.inbox.repository;

import com.global.inbox.model.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends ReactiveCrudRepository<Item, UUID> {

}
