package com.zac.domagen.db.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 * @author Zac
 */
@Entity(listener = TestTblListener.class)
@Table(name = "test_tbl")
public class TestTbl {

    /**  */
    @Id
    @Column(name = "item_int")
    Integer itemInt;

    /**  */
    @Column(name = "item_varchar")
    String itemVarchar;

    /**  */
    @Column(name = "item_text")
    String itemText;

    /**  */
    @Column(name = "item_date")
    LocalDate itemDate;

    /**  */
    @Column(name = "item_tinyint")
    Byte itemTinyint;

    /**  */
    @Column(name = "item_smallint")
    Short itemSmallint;

    /**  */
    @Column(name = "item_bigint")
    Long itemBigint;

    /**  */
    @Column(name = "item_decimal")
    BigDecimal itemDecimal;

    /**  */
    @Column(name = "item_float")
    Float itemFloat;

    /**  */
    @Column(name = "item_double")
    Double itemDouble;

    /**  */
    @Column(name = "item_real")
    Double itemReal;

    /**  */
    @Column(name = "item_bit")
    Byte itemBit;

    /**  */
    @Column(name = "item_boolean")
    Boolean itemBoolean;

    /**  */
    @Column(name = "item_serial")
    BigInteger itemSerial;

    /**  */
    @Column(name = "item_datetime")
    LocalDateTime itemDatetime;

    /**  */
    @Column(name = "item_timestamp")
    LocalDateTime itemTimestamp;

    /**  */
    @Column(name = "item_time")
    LocalTime itemTime;

    /**  */
    @Column(name = "item_year")
    Short itemYear;

    /**  */
    @Column(name = "item_char")
    String itemChar;

    /**  */
    @Column(name = "item_tinytext")
    String itemTinytext;

    /**  */
    @Column(name = "item_mediumtext")
    String itemMediumtext;

    /** 
     * Returns the itemInt.
     * 
     * @return the itemInt
     */
    public Integer getItemInt() {
        return itemInt;
    }

    /** 
     * Sets the itemInt.
     * 
     * @param itemInt the itemInt
     */
    public void setItemInt(Integer itemInt) {
        this.itemInt = itemInt;
    }

    /** 
     * Returns the itemVarchar.
     * 
     * @return the itemVarchar
     */
    public String getItemVarchar() {
        return itemVarchar;
    }

    /** 
     * Sets the itemVarchar.
     * 
     * @param itemVarchar the itemVarchar
     */
    public void setItemVarchar(String itemVarchar) {
        this.itemVarchar = itemVarchar;
    }

    /** 
     * Returns the itemText.
     * 
     * @return the itemText
     */
    public String getItemText() {
        return itemText;
    }

    /** 
     * Sets the itemText.
     * 
     * @param itemText the itemText
     */
    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    /** 
     * Returns the itemDate.
     * 
     * @return the itemDate
     */
    public LocalDate getItemDate() {
        return itemDate;
    }

    /** 
     * Sets the itemDate.
     * 
     * @param itemDate the itemDate
     */
    public void setItemDate(LocalDate itemDate) {
        this.itemDate = itemDate;
    }

    /** 
     * Returns the itemTinyint.
     * 
     * @return the itemTinyint
     */
    public Byte getItemTinyint() {
        return itemTinyint;
    }

    /** 
     * Sets the itemTinyint.
     * 
     * @param itemTinyint the itemTinyint
     */
    public void setItemTinyint(Byte itemTinyint) {
        this.itemTinyint = itemTinyint;
    }

    /** 
     * Returns the itemSmallint.
     * 
     * @return the itemSmallint
     */
    public Short getItemSmallint() {
        return itemSmallint;
    }

    /** 
     * Sets the itemSmallint.
     * 
     * @param itemSmallint the itemSmallint
     */
    public void setItemSmallint(Short itemSmallint) {
        this.itemSmallint = itemSmallint;
    }

    /** 
     * Returns the itemBigint.
     * 
     * @return the itemBigint
     */
    public Long getItemBigint() {
        return itemBigint;
    }

    /** 
     * Sets the itemBigint.
     * 
     * @param itemBigint the itemBigint
     */
    public void setItemBigint(Long itemBigint) {
        this.itemBigint = itemBigint;
    }

    /** 
     * Returns the itemDecimal.
     * 
     * @return the itemDecimal
     */
    public BigDecimal getItemDecimal() {
        return itemDecimal;
    }

    /** 
     * Sets the itemDecimal.
     * 
     * @param itemDecimal the itemDecimal
     */
    public void setItemDecimal(BigDecimal itemDecimal) {
        this.itemDecimal = itemDecimal;
    }

    /** 
     * Returns the itemFloat.
     * 
     * @return the itemFloat
     */
    public Float getItemFloat() {
        return itemFloat;
    }

    /** 
     * Sets the itemFloat.
     * 
     * @param itemFloat the itemFloat
     */
    public void setItemFloat(Float itemFloat) {
        this.itemFloat = itemFloat;
    }

    /** 
     * Returns the itemDouble.
     * 
     * @return the itemDouble
     */
    public Double getItemDouble() {
        return itemDouble;
    }

    /** 
     * Sets the itemDouble.
     * 
     * @param itemDouble the itemDouble
     */
    public void setItemDouble(Double itemDouble) {
        this.itemDouble = itemDouble;
    }

    /** 
     * Returns the itemReal.
     * 
     * @return the itemReal
     */
    public Double getItemReal() {
        return itemReal;
    }

    /** 
     * Sets the itemReal.
     * 
     * @param itemReal the itemReal
     */
    public void setItemReal(Double itemReal) {
        this.itemReal = itemReal;
    }

    /** 
     * Returns the itemBit.
     * 
     * @return the itemBit
     */
    public Byte getItemBit() {
        return itemBit;
    }

    /** 
     * Sets the itemBit.
     * 
     * @param itemBit the itemBit
     */
    public void setItemBit(Byte itemBit) {
        this.itemBit = itemBit;
    }

    /** 
     * Returns the itemBoolean.
     * 
     * @return the itemBoolean
     */
    public Boolean getItemBoolean() {
        return itemBoolean;
    }

    /** 
     * Sets the itemBoolean.
     * 
     * @param itemBoolean the itemBoolean
     */
    public void setItemBoolean(Boolean itemBoolean) {
        this.itemBoolean = itemBoolean;
    }

    /** 
     * Returns the itemSerial.
     * 
     * @return the itemSerial
     */
    public BigInteger getItemSerial() {
        return itemSerial;
    }

    /** 
     * Sets the itemSerial.
     * 
     * @param itemSerial the itemSerial
     */
    public void setItemSerial(BigInteger itemSerial) {
        this.itemSerial = itemSerial;
    }

    /** 
     * Returns the itemDatetime.
     * 
     * @return the itemDatetime
     */
    public LocalDateTime getItemDatetime() {
        return itemDatetime;
    }

    /** 
     * Sets the itemDatetime.
     * 
     * @param itemDatetime the itemDatetime
     */
    public void setItemDatetime(LocalDateTime itemDatetime) {
        this.itemDatetime = itemDatetime;
    }

    /** 
     * Returns the itemTimestamp.
     * 
     * @return the itemTimestamp
     */
    public LocalDateTime getItemTimestamp() {
        return itemTimestamp;
    }

    /** 
     * Sets the itemTimestamp.
     * 
     * @param itemTimestamp the itemTimestamp
     */
    public void setItemTimestamp(LocalDateTime itemTimestamp) {
        this.itemTimestamp = itemTimestamp;
    }

    /** 
     * Returns the itemTime.
     * 
     * @return the itemTime
     */
    public LocalTime getItemTime() {
        return itemTime;
    }

    /** 
     * Sets the itemTime.
     * 
     * @param itemTime the itemTime
     */
    public void setItemTime(LocalTime itemTime) {
        this.itemTime = itemTime;
    }

    /** 
     * Returns the itemYear.
     * 
     * @return the itemYear
     */
    public Short getItemYear() {
        return itemYear;
    }

    /** 
     * Sets the itemYear.
     * 
     * @param itemYear the itemYear
     */
    public void setItemYear(Short itemYear) {
        this.itemYear = itemYear;
    }

    /** 
     * Returns the itemChar.
     * 
     * @return the itemChar
     */
    public String getItemChar() {
        return itemChar;
    }

    /** 
     * Sets the itemChar.
     * 
     * @param itemChar the itemChar
     */
    public void setItemChar(String itemChar) {
        this.itemChar = itemChar;
    }

    /** 
     * Returns the itemTinytext.
     * 
     * @return the itemTinytext
     */
    public String getItemTinytext() {
        return itemTinytext;
    }

    /** 
     * Sets the itemTinytext.
     * 
     * @param itemTinytext the itemTinytext
     */
    public void setItemTinytext(String itemTinytext) {
        this.itemTinytext = itemTinytext;
    }

    /** 
     * Returns the itemMediumtext.
     * 
     * @return the itemMediumtext
     */
    public String getItemMediumtext() {
        return itemMediumtext;
    }

    /** 
     * Sets the itemMediumtext.
     * 
     * @param itemMediumtext the itemMediumtext
     */
    public void setItemMediumtext(String itemMediumtext) {
        this.itemMediumtext = itemMediumtext;
    }
}