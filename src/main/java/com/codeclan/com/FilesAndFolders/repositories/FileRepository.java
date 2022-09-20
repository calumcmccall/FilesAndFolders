package com.codeclan.com.FilesAndFolders.repositories;

import com.codeclan.com.FilesAndFolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
