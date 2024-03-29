/*
 * This file is generated by jOOQ.
 */
package ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import ru.omsu.imit.course3.lab5.server.selectioncommittee.jooq.generated.tables.Applications;

import javax.annotation.Generated;


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
public class ApplicationsRecord extends UpdatableRecordImpl<ApplicationsRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = -1573019444;

    /**
     * Setter for <code>selectioncommittee.applications.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>selectioncommittee.applications.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>selectioncommittee.applications.applicant_id</code>.
     */
    public void setApplicantId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>selectioncommittee.applications.applicant_id</code>.
     */
    public Integer getApplicantId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>selectioncommittee.applications.specialty_id</code>.
     */
    public void setSpecialtyId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>selectioncommittee.applications.specialty_id</code>.
     */
    public Integer getSpecialtyId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Applications.APPLICATIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Applications.APPLICATIONS.APPLICANT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Applications.APPLICATIONS.SPECIALTY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getApplicantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSpecialtyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getApplicantId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSpecialtyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationsRecord value2(Integer value) {
        setApplicantId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationsRecord value3(Integer value) {
        setSpecialtyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationsRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationsRecord
     */
    public ApplicationsRecord() {
        super(Applications.APPLICATIONS);
    }

    /**
     * Create a detached, initialised ApplicationsRecord
     */
    public ApplicationsRecord(Integer id, Integer applicantId, Integer specialtyId) {
        super(Applications.APPLICATIONS);

        set(0, id);
        set(1, applicantId);
        set(2, specialtyId);
    }
}
