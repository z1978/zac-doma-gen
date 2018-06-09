package com.zac.domagen.db.dao;

import com.zac.domagen.db.entity.TestTbl;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 * @author Zac
 */
@Dao
@ConfigAutowireable
public interface TestTblDao {

    /**
     * @param id
     * @return the TestTbl entity
     */
    @Select
    TestTbl selectById(Short id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TestTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TestTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TestTbl entity);
}