package de.bambussoft.jooqdemo;

import de.bambussoft.jooqdemo.jooq.gen.Tables;
import de.bambussoft.jooqdemo.jooq.gen.tables.BooleanTests;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;

@JooqTest
public class JooqDslTest {


    @Autowired
    private DSLContext dslContext;

    @Test
    void dslTest() {
        Object stringBoolean = dslContext.selectFrom(Tables.BOOLEAN_TESTS).fetchAny(BooleanTests.BOOLEAN_TESTS.STRING_BOOLEAN);
        Object intBoolean = dslContext.selectFrom(Tables.BOOLEAN_TESTS).fetchAny(BooleanTests.BOOLEAN_TESTS.INT);
        assert stringBoolean instanceof Boolean && intBoolean instanceof Boolean;
    }
}
