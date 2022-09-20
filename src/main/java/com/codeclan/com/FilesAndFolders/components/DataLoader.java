package com.codeclan.com.FilesAndFolders.components;

import com.codeclan.com.FilesAndFolders.models.File;
import com.codeclan.com.FilesAndFolders.models.Folder;
import com.codeclan.com.FilesAndFolders.models.Person;
import com.codeclan.com.FilesAndFolders.repositories.FileRepository;
import com.codeclan.com.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.com.FilesAndFolders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class DataLoader implements ApplicationRunner {

    public DataLoader(){}

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person jerryTaxes = new Person("Jerry");
        Folder accounting = new Folder("Money Folder", jerryTaxes);
        File numbersFile = new File("Numbers", ".xls", 12, accounting);
        jerryTaxes.addFolder(accounting);
        accounting.addFile(numbersFile);
        personRepository.save(jerryTaxes);
        folderRepository.save(accounting);
        fileRepository.save(numbersFile);
    }
}
