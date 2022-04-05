/*
 * This file is generated by jOOQ.
 */
package de.bambussoft.jooqdemo.jooq.gen.tables.records;


import de.bambussoft.jooqdemo.jooq.gen.tables.BooleanTests;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BooleanTestsRecord extends TableRecordImpl<BooleanTestsRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.BOOLEAN_TESTS.NAME</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOLEAN_TESTS.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BOOLEAN_TESTS.STRING_BOOLEAN</code>.
     */
    public void setStringBoolean(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOLEAN_TESTS.STRING_BOOLEAN</code>.
     */
    public String getStringBoolean() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.BOOLEAN_TESTS.INT_BOOLEAN</code>.
     */
    public void setIntBoolean(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOLEAN_TESTS.INT_BOOLEAN</code>.
     */
    public Integer getIntBoolean() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return BooleanTests.BOOLEAN_TESTS.NAME;
    }

    @Override
    public Field<String> field2() {
        return BooleanTests.BOOLEAN_TESTS.STRING_BOOLEAN;
    }

    @Override
    public Field<Integer> field3() {
        return BooleanTests.BOOLEAN_TESTS.INT_BOOLEAN;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public String component2() {
        return getStringBoolean();
    }

    @Override
    public Integer component3() {
        return getIntBoolean();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public String value2() {
        return getStringBoolean();
    }

    @Override
    public Integer value3() {
        return getIntBoolean();
    }

    @Override
    public BooleanTestsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public BooleanTestsRecord value2(String value) {
        setStringBoolean(value);
        return this;
    }

    @Override
    public BooleanTestsRecord value3(Integer value) {
        setIntBoolean(value);
        return this;
    }

    @Override
    public BooleanTestsRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BooleanTestsRecord
     */
    public BooleanTestsRecord() {
        super(BooleanTests.BOOLEAN_TESTS);
    }

    /**
     * Create a detached, initialised BooleanTestsRecord
     */
    public BooleanTestsRecord(String name, String stringBoolean, Integer intBoolean) {
        super(BooleanTests.BOOLEAN_TESTS);

        setName(name);
        setStringBoolean(stringBoolean);
        setIntBoolean(intBoolean);
    }

    /**
     * Create a detached, initialised BooleanTestsRecord
     */
    public BooleanTestsRecord(de.bambussoft.jooqdemo.jooq.gen.tables.pojos.BooleanTests value) {
        super(BooleanTests.BOOLEAN_TESTS);

        if (value != null) {
            setName(value.getName());
            setStringBoolean(value.getStringBoolean());
            setIntBoolean(value.getIntBoolean());
        }
    }
}