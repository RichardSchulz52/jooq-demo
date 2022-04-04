/*
 * This file is generated by jOOQ.
 */
package de.bambussoft.jooqdemo.jooq.gen.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BooleanTests implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  name;
    private String  stringBoolean;
    private Integer intBoolean;

    public BooleanTests() {}

    public BooleanTests(BooleanTests value) {
        this.name = value.name;
        this.stringBoolean = value.stringBoolean;
        this.intBoolean = value.intBoolean;
    }

    public BooleanTests(
        String  name,
        String  stringBoolean,
        Integer intBoolean
    ) {
        this.name = name;
        this.stringBoolean = stringBoolean;
        this.intBoolean = intBoolean;
    }

    /**
     * Getter for <code>PUBLIC.BOOLEAN_TESTS.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>PUBLIC.BOOLEAN_TESTS.NAME</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>PUBLIC.BOOLEAN_TESTS.STRING_BOOLEAN</code>.
     */
    public String getStringBoolean() {
        return this.stringBoolean;
    }

    /**
     * Setter for <code>PUBLIC.BOOLEAN_TESTS.STRING_BOOLEAN</code>.
     */
    public void setStringBoolean(String stringBoolean) {
        this.stringBoolean = stringBoolean;
    }

    /**
     * Getter for <code>PUBLIC.BOOLEAN_TESTS.INT_BOOLEAN</code>.
     */
    public Integer getIntBoolean() {
        return this.intBoolean;
    }

    /**
     * Setter for <code>PUBLIC.BOOLEAN_TESTS.INT_BOOLEAN</code>.
     */
    public void setIntBoolean(Integer intBoolean) {
        this.intBoolean = intBoolean;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final BooleanTests other = (BooleanTests) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (stringBoolean == null) {
            if (other.stringBoolean != null)
                return false;
        }
        else if (!stringBoolean.equals(other.stringBoolean))
            return false;
        if (intBoolean == null) {
            if (other.intBoolean != null)
                return false;
        }
        else if (!intBoolean.equals(other.intBoolean))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.stringBoolean == null) ? 0 : this.stringBoolean.hashCode());
        result = prime * result + ((this.intBoolean == null) ? 0 : this.intBoolean.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BooleanTests (");

        sb.append(name);
        sb.append(", ").append(stringBoolean);
        sb.append(", ").append(intBoolean);

        sb.append(")");
        return sb.toString();
    }
}