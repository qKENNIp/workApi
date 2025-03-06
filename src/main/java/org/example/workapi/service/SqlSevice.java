package org.example.workapi.service;

import org.example.workapi.Entity.EntityPerson;
import java.util.ArrayList;

public interface SqlSevice {

    public void SqlAddUser(EntityPerson entityPerson);
    public ArrayList<EntityPerson> SqlShowUser(ArrayList<EntityPerson> entityPeople);


}
