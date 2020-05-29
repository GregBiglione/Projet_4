package com.greg.mareu.service;

import com.greg.mareu.model.Reunion;

import java.util.Date;
import java.util.List;

public interface ReunionApiService
{
    /**
     * Get Reunions list
     */

    List<Reunion> getReunions();

    /**
     * Get Reunion by date
     */

    List<Reunion> getReunionByDate(Date startDate, Date endDate);

    /**
     * Get Reunion by room
     */

    //List<Reunion> getReunionByRoom(Reunion reunion);

    /**
     * Delete a reunion
     * @param reunion
     */

    /**
     * Check matches with existing reunion
     */

    //void checkMatches();

    void deleteReunion(Reunion reunion);

    /**
     *  Create a reunion
     * @param reunion
     */

    void createReunion(Reunion reunion);
}
