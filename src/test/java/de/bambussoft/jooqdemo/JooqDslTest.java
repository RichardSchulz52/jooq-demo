package de.bambussoft.jooqdemo;

import de.bambussoft.jooqdemo.jooq.gen.Tables;
import de.bambussoft.jooqdemo.jooq.gen.tables.BooleanTests;
import de.bambussoft.jooqdemo.jooq.gen.tables.pojos.EnumTests;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;

import java.util.List;
import java.util.stream.Collectors;

@JooqTest
class JooqDslTest {


    @Autowired
    private DSLContext dslContext;

    @Test
    void dslTest() {
        Object stringBoolean = dslContext.selectFrom(Tables.BOOLEAN_TESTS).fetchAny(BooleanTests.BOOLEAN_TESTS.STRING_BOOLEAN);
        Object intBoolean = dslContext.selectFrom(Tables.BOOLEAN_TESTS).fetchAny(BooleanTests.BOOLEAN_TESTS.INT_BOOLEAN);
        assert stringBoolean instanceof Boolean && intBoolean instanceof Boolean;
    }

    @Test
    void enumTest() {
        List<MyEnum> enums = dslContext.selectFrom(Tables.ENUM_TESTS).fetch().into(EnumTests.class).stream().map(EnumTests::getMyEnum).collect(
                Collectors.toList());
        assert enums.containsAll(List.of(MyEnum.values()));
    }

}
