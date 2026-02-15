package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

// Controller ---> Service ---> repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
