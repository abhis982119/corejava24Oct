package org.batch.exceptionhandling.userdefinedexceptions.compiletimeexception.fileuploadservice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MyFile {

    private String fileName;
    private FileFormat fileFormat;

    private int size; // IS IN MB
}
