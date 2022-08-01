package com.example.lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirFind {
    
    public static void main(String[] args) {
        

        try(Stream<Path> files = Files.find(Paths.get("."), 9, (p,a) -> a.isDirectory())){ // Add try with resources
            
            System.out.println("\n=== Find all dirs ===");
            // Print out directory list here
            files.forEach(line -> System.out.println(line));
                
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    } 
}
