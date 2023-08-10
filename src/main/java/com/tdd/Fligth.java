package com.tdd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Fligth {

    private String reference;
    private LocalDateTime localDateTime;
    private String origin;
    private String destination;

    public Fligth(String reference, LocalDateTime localDateTime, String origin, String destination) {
        this.reference = reference;
        this.localDateTime = localDateTime;
        this.origin = origin;
        this.destination = destination;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fligth fligth = (Fligth) o;
        return Objects.equals(reference, fligth.reference) && Objects.equals(localDateTime, fligth.localDateTime) && Objects.equals(origin, fligth.origin) && Objects.equals(destination, fligth.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reference, localDateTime, origin, destination);
    }
}
