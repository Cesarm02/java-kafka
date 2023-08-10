package com.tdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FligthController {

    private Map<String, Fligth> fligths;

    public FligthController(){
        fligths = new HashMap<String, Fligth>();
    }

    public void addFligth(Fligth fligh) {
        fligths.put(fligh.getReference(), fligh);
    }

    public Fligth findFligthByReference(String reference) {
        Fligth fligth = fligths.get(reference);
        if(fligth == null)
            throw new FlightNotFoundException();
        else
            return  fligth;
    }
}
