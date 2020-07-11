package com.RobertM.CarRental.bootstrap;


import com.RobertM.CarRental.repositories.BaseRepository;
import com.RobertM.CarRental.repositories.CarRepository;
import com.RobertM.CarRental.repositories.EmploeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BaseRepository baseRepository;
    private final CarRepository carRepository;
    private final EmploeeRepository emploeeRepository;

    public BootStrapData(BaseRepository baseRepository, CarRepository carRepository, EmploeeRepository emploeeRepository) {
        this.baseRepository = baseRepository;
        this.carRepository = carRepository;
        this.emploeeRepository = emploeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
