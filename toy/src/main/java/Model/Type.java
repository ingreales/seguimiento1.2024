package Model;

import java.util.Arrays;

public enum Type {
    F(0),
    M(1),
     MX(2);


    private final int value;

    Type(int value){this.value= value;}
     public static Type getValues(int value){
        return Arrays.stream(Type.values()).filter(e->e.value==value).findFirst().orElseThrow();
     }
    }




