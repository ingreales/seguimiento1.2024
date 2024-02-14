package Mapping;

import Model.Toy;

public class ToyMappers {
    public static Toy mapFrom(ToyDTO dto){
        return new Toy (dto.type(), dto.name(),dto.quantity(),dto.price());

    }
    public static ToyDTO mapFrom(Toy model){
        return new ToyDTO(model.getType(), model.getName(),model.getQuantity(),model.getPrice());
    }
}
