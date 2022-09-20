package com.codeclan.com.FilesAndFolders.repositories;

import com.codeclan.com.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
