/*
 * This file is generated by jOOQ.
 */
package com.wehuddle.db.tables.records;


import com.wehuddle.db.tables.BadgeAchievement;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BadgeAchievementRecord extends UpdatableRecordImpl<BadgeAchievementRecord> implements Record5<UUID, UUID, UUID, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.badge_achievement.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.badge_achievement.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.badge_achievement.profileid</code>.
     */
    public void setProfileid(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.badge_achievement.profileid</code>.
     */
    public UUID getProfileid() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.badge_achievement.badgeid</code>.
     */
    public void setBadgeid(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.badge_achievement.badgeid</code>.
     */
    public UUID getBadgeid() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>public.badge_achievement.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.badge_achievement.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.badge_achievement.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.badge_achievement.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, UUID, UUID, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UUID, UUID, UUID, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return BadgeAchievement.BADGE_ACHIEVEMENT.ID;
    }

    @Override
    public Field<UUID> field2() {
        return BadgeAchievement.BADGE_ACHIEVEMENT.PROFILEID;
    }

    @Override
    public Field<UUID> field3() {
        return BadgeAchievement.BADGE_ACHIEVEMENT.BADGEID;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return BadgeAchievement.BADGE_ACHIEVEMENT.CREATED_AT;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return BadgeAchievement.BADGE_ACHIEVEMENT.UPDATED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getProfileid();
    }

    @Override
    public UUID component3() {
        return getBadgeid();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime component5() {
        return getUpdatedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getProfileid();
    }

    @Override
    public UUID value3() {
        return getBadgeid();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreatedAt();
    }

    @Override
    public OffsetDateTime value5() {
        return getUpdatedAt();
    }

    @Override
    public BadgeAchievementRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public BadgeAchievementRecord value2(UUID value) {
        setProfileid(value);
        return this;
    }

    @Override
    public BadgeAchievementRecord value3(UUID value) {
        setBadgeid(value);
        return this;
    }

    @Override
    public BadgeAchievementRecord value4(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public BadgeAchievementRecord value5(OffsetDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public BadgeAchievementRecord values(UUID value1, UUID value2, UUID value3, OffsetDateTime value4, OffsetDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BadgeAchievementRecord
     */
    public BadgeAchievementRecord() {
        super(BadgeAchievement.BADGE_ACHIEVEMENT);
    }

    /**
     * Create a detached, initialised BadgeAchievementRecord
     */
    public BadgeAchievementRecord(UUID id, UUID profileid, UUID badgeid, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        super(BadgeAchievement.BADGE_ACHIEVEMENT);

        setId(id);
        setProfileid(profileid);
        setBadgeid(badgeid);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
    }
}
