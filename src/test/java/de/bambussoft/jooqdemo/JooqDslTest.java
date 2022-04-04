package de.bambussoft.jooqdemo;

import de.bambussoft.jooqdemo.jooq.gen.Tables;
import de.bambussoft.jooqdemo.jooq.gen.tables.records.BooleanTestsRecord;
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
        Result<BooleanTestsRecord> fetch = dslContext.selectFrom(Tables.BOOLEAN_TESTS).fetch();

    }
}
