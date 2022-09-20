package com.codeclan.com.FilesAndFolders.repositories;

import com.codeclan.com.FilesAndFolders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
