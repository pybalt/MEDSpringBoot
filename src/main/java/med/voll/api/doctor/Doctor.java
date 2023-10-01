package med.voll.api.doctor;

import med.voll.api.direction.Direction;

public record Doctor(String name, String email, String dni, Specialty specialty, Direction direction){
}
