package tdd;

/*
    Controlador de vuelos
        - Añadir vuelos
        - Buscar vuelos por referencia
        - Buscar vuelos por origen
        - Buscar vuelos entre dos fechas
        - Eliminar vuelos
 */

import com.tdd.FlightNotFoundException;
import com.tdd.Fligth;
import com.tdd.FligthController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FligthControllerTest {

    private FligthController fligthController;

    @BeforeEach
    public void setUp(){
        fligthController = new FligthController();
    }

    @Test
    public void givenEmptyFlighControllerWhenAddedThenReturnReferencesFligth(){
        LocalDate localDate = LocalDate.of(2021,1,1);
        LocalTime localTime = LocalTime.of(10,30);
        Fligth fligh = new Fligth("1", LocalDateTime.of(localDate, localTime), "Madrid", "Barcelona");
        fligthController.addFligth(fligh);

        Assertions.assertEquals(fligh, fligthController.findFligthByReference("1"));
    }

    @Test
    public void givenEmptyFligthControllerWhenGetByReferencesThenTrhow(){
        Assertions.assertThrows(FlightNotFoundException.class, () -> {
                fligthController.findFligthByReference("1");
        });
    }

}
