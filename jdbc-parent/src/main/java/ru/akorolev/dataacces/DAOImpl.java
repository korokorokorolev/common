package ru.akorolev.dataacces;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by akorolev on 5/9/14.
 */
public class DAOImpl implements DAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String getValueById(int id) {
        return jdbcTemplate.queryForObject("select name from person where id =1", String.class);
    }
}
