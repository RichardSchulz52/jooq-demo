package de.bambussoft.jooqdemo.jooq.converter;

import de.bambussoft.jooqdemo.MyEnum;
import org.jooq.impl.EnumConverter;

public class MyEnumConverter extends EnumConverter<String, MyEnum> {

    public MyEnumConverter(){
        super(String.class, MyEnum.class);
    }

}
