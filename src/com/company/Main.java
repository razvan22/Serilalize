package com.company;

import com.company.persons.Person;
import com.company.vehicle.Engine;
import com.company.vehicle.SportCar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Engine subaruEngine = new Engine(4,280,"JCM-5023");
        SportCar subaru = new SportCar("Subaru","Impreza-WRX","blue",5,1200,2500,subaruEngine,"4-DW");

        Path vehiclePath = Paths.get("Vehicle");
//        Files.createDirectory(vehiclePath);

        File.serialize(vehiclePath.toString()+"/"+subaru.getBrand(),subaru);
        Object sub = File.deSerialize(vehiclePath.toString()+"/"+subaru.getBrand());

        String personPath = "Persons/";
        Person bran = new Person("Bran",180,"blue",85);
        File.serialize(personPath+bran.getName(),bran);
        File.deSerialize(personPath+bran.getName());

    }
}
