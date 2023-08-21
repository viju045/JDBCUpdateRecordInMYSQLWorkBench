/**
 * Created By VijayKumar Mohite
 * Date : 8/21/2023
 * Time : 10:22 AM
 * Project : SpringJDBCWithUpdatingRecordInDB
 **/

package org.example.dao;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import javax.sql.DataSource;
import java.sql.Types;

public class UpdateRecordDao {
    private DataSource dataSource;
    private ProjectUpdate projectUpdate;
    private final String SQL_FOR_UPDATE = "Update jdbcinsert set title=? where insertId=? ";

    public UpdateRecordDao(DataSource dataSource) {
        this.dataSource = dataSource;
        projectUpdate = new ProjectUpdate(dataSource,SQL_FOR_UPDATE);
    }
    public int updateProjects(int insertId,String title ){
        return projectUpdate.update(new Object[]{title,insertId});
    }

    private final class ProjectUpdate extends SqlUpdate{
        public ProjectUpdate(DataSource dataSource1,String sqlQuery){
            super(dataSource1,sqlQuery);
            declareParameter(new SqlParameter(Types.VARCHAR));
            declareParameter(new SqlParameter(Types.INTEGER));
            compile();
        }
    }
}
