package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class FligthController {

    private List<Fligth> fligths;

    public FligthController(){
        fligths = new ArrayList<>();
    }

    public void addFligth(Fligth fligh) {
        fligths.add(fligh);
    }

    public Fligth findFligthByReference(String reference) {
        for(Fligth fligth : fligths){
            if (fligth.getReference().equals(reference))
                return fligth;
        }
        throw new FlightNotFoundException();
    }
}
