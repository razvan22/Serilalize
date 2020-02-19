package com.company;

import com.company.persons.Person;
import com.company.vehicle.Engine;
import com.company.vehicle.Minivan;
import com.company.vehicle.SportCar;
import com.company.vehicle.Vehicle;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        Engine subaruEngine = new Engine(4,280,"JCM-5023");
        SportCar subaru = new SportCar("Subaru","Impreza-WRX","blue",5,1200,2500,subaruEngine,"4-DW");
        Path vehiclePath = Paths.get("Vehicle");

        System.out.println("Writing object "+subaru.getBrand()+" to folder "+vehiclePath.toString()+"/"+subaru.getBrand());
        File.serialize(vehiclePath.toString()+"/"+subaru.getBrand(),subaru);

        SportCar sportCar  = (SportCar) File.deSerialize(vehiclePath.toString()+"/"+subaru.getBrand());
        System.out.println("Reading object "+sportCar.getBrand()+" from folder "+vehiclePath.toString()+"/"+subaru.getBrand()+"\n");
//      =======================================================================================================================


        Engine minivanEngine = new Engine(4,120,"Bs79nf");
        Minivan honda = new Minivan("Honda","Civic","green",5,1600,2700,minivanEngine);

        File.serialize(vehiclePath.toString(),honda);
        System.out.println("Writing object "+honda.getBrand()+" to file /"+vehiclePath.toString());

       Minivan minivan = (Minivan) File.deSerialize(vehiclePath.toString());
        System.out.println("Reading object "+minivan.getBrand()+" from file /"+vehiclePath.toString()+"\n");

//       =======================================================================================================================

        String personPath = "Persons/";
        Person bran = new Person("Bran",180,"blue",85);

        System.out.println("Writing object "+bran.getName()+" to folder "+personPath);
        File.serialize(personPath+bran.getName(),bran);

        Person person = (Person) File.deSerialize(personPath+bran.getName());
        System.out.println("Reading object "+person.getName()+" from folder "+personPath+"\n");


    }
}
