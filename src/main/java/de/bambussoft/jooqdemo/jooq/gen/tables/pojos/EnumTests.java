/*
 * This file is generated by jOOQ.
 */
package de.bambussoft.jooqdemo.jooq.gen.tables.pojos;


import de.bambussoft.jooqdemo.MyEnum;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EnumTests implements Serializable {

    private static final long serialVersionUID = 1L;

    private MyEnum myEnum;

    public EnumTests() {}

    public EnumTests(EnumTests value) {
        this.myEnum = value.myEnum;
    }

    public EnumTests(
        MyEnum myEnum
    ) {
        this.myEnum = myEnum;
    }

    /**
     * Getter for <code>PUBLIC.ENUM_TESTS.MY_ENUM</code>.
     */
    public MyEnum getMyEnum() {
        return this.myEnum;
    }

    /**
     * Setter for <code>PUBLIC.ENUM_TESTS.MY_ENUM</code>.
     */
    public void setMyEnum(MyEnum myEnum) {
        this.myEnum = myEnum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EnumTests other = (EnumTests) obj;
        if (myEnum == null) {
            if (other.myEnum != null)
                return false;
        }
        else if (!myEnum.equals(other.myEnum))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.myEnum == null) ? 0 : this.myEnum.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EnumTests (");

        sb.append(myEnum);

        sb.append(")");
        return sb.toString();
    }
}