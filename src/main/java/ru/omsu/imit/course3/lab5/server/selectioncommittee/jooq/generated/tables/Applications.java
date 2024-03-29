/*
 * This file is generated by jOOQ.
 */
package ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.Indexes;
import ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.Keys;
import ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.Selectioncommittee;
import ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.tables.records.ApplicationsRecord;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.11.11"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Applications extends TableImpl<ApplicationsRecord> {

    private static final long serialVersionUID = 894861444;

    /**
     * The reference instance of <code>selectioncommittee.applications</code>
     */
    public static final Applications APPLICATIONS = new Applications();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ApplicationsRecord> getRecordType() {
        return ApplicationsRecord.class;
    }

    /**
     * The column <code>selectioncommittee.applications.id</code>.
     */
    public final TableField<ApplicationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>selectioncommittee.applications.applicant_id</code>.
     */
    public final TableField<ApplicationsRecord, Integer> APPLICANT_ID = createField("applicant_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>selectioncommittee.applications.specialty_id</code>.
     */
    public final TableField<ApplicationsRecord, Integer> SPECIALTY_ID = createField("specialty_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>selectioncommittee.applications</code> table reference
     */
    public Applications() {
        this(DSL.name("applications"), null);
    }

    /**
     * Create an aliased <code>selectioncommittee.applications</code> table reference
     */
    public Applications(String alias) {
        this(DSL.name(alias), APPLICATIONS);
    }

    /**
     * Create an aliased <code>selectioncommittee.applications</code> table reference
     */
    public Applications(Name alias) {
        this(alias, APPLICATIONS);
    }

    private Applications(Name alias, Table<ApplicationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Applications(Name alias, Table<ApplicationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Applications(Table<O> child, ForeignKey<O, ApplicationsRecord> key) {
        super(child, key, APPLICATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Selectioncommittee.SELECTIONCOMMITTEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.APPLICATIONS_APPLICANT_ID, Indexes.APPLICATIONS_PRIMARY, Indexes.APPLICATIONS_SPECIALTY_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ApplicationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_APPLICATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ApplicationsRecord> getPrimaryKey() {
        return Keys.KEY_APPLICATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ApplicationsRecord>> getKeys() {
        return Arrays.<UniqueKey<ApplicationsRecord>>asList(Keys.KEY_APPLICATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ApplicationsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ApplicationsRecord, ?>>asList(Keys.APPLICATIONS_IBFK_1, Keys.APPLICATIONS_IBFK_2);
    }

    public Applicants applicants() {
        return new Applicants(this, Keys.APPLICATIONS_IBFK_1);
    }

    public Specialty specialty() {
        return new Specialty(this, Keys.APPLICATIONS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Applications as(String alias) {
        return new Applications(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Applications as(Name alias) {
        return new Applications(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Applications rename(String name) {
        return new Applications(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Applications rename(Name name) {
        return new Applications(name, null);
    }
}
