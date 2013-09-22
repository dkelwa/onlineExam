package com.exam.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.exam.dao.ProfileDAO;
import com.exam.model.Profile;

@Repository
public class ProfileDAOImpl implements ProfileDAO {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Profile profile) {
	String query = "INSERT INTO profile (legalname, name, email, homephone, cellphone, city, state, country,"
		+ " birthdate, gender, allergies, languagepref, carbuspref, emergency_name, emergency_ph1, "
		+ "emergency_ph2, userid) VALUES"
		+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	jdbcTemplate.update(
		query,
		new Object[] { profile.getLegalName(),
			profile.getInitiatedName(), profile.getEmail(),
			profile.getHomePhone(), profile.getCellPhone(),
			profile.getCity(), profile.getState(),
			profile.getCountry(), profile.getDob(),
			profile.getGender(), profile.getAllergies(),
			profile.getLangPref(), profile.getCarBuPref(),
			profile.getEmergencyName(),
			profile.getEmergencyPhone1(),
			profile.getEmergencyPhone2(), profile.getUserId() });
    }
}
