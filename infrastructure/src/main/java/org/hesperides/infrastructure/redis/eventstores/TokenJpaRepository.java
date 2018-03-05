package org.hesperides.infrastructure.redis.eventstores;

import org.axonframework.eventhandling.tokenstore.jpa.TokenEntry;
import org.springframework.data.repository.CrudRepository;

public interface TokenJpaRepository extends CrudRepository<TokenEntry, TokenEntry.PK> {
}
