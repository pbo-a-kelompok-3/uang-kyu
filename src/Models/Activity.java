/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Utils.Database;

/**
 *
 * @author Alfian Andi Nugraha
 */
public class Activity {
    private int id;
    private String description;
    private float nominal;
    private int typeId;
    private int createdAt;
    private int updatedAt;
    private String tableName = "activities";
    
    public int getId() {
        return id;
    }

    public Activity setId(int id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Activity setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getNominal() {
        return nominal;
    }

    public Activity setNominal(float nominal) {
        this.nominal = nominal;
        return this;

    }

    public int getTypeId() {
        return typeId;
    }

    public Activity setTypeId(int typeId) {
        this.typeId = typeId;
        return this;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public Activity setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public Activity setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    public void insert() throws Exception {
        String query = String.format(
            "INSERT INTO %s (type_id, description, nominal, created_at, updated_at) VALUES (%d, \"%s\", %f, %d, %d)", 
            this.tableName, this.getTypeId(), this.getDescription(), this.getNominal(), this.getCreatedAt(), this.getUpdatedAt()
        );
        
        try {
            Statement statement = Database.ConfigDB().createStatement();
            statement.executeUpdate(query);
        } catch (Exception err) {
            throw err;
        }
    }
    
    public void delete() throws Exception {
        String query = String.format(
            "DELETE FROM %s WHERE id = %d",
            this.tableName, this.getId()
        );
        
        try {
            Statement statement = Database.ConfigDB().createStatement();
            statement.executeUpdate(query);
        } catch (Exception err) {
            throw err;
        }
    }
    
    public void update() throws Exception {
        String query = String.format(
            "UPDATE %s SET type_id = %d, description = \"%s\", nominal = %f, created_at = %d, updated_at = %d WHERE id = %d",
            this.tableName, this.getTypeId(), this.getDescription(), this.getNominal(), this.getCreatedAt(), this.getUpdatedAt(), this.getId()
        );
        
        try {
            Statement statement = Database.ConfigDB().createStatement();
            statement.executeUpdate(query);
        } catch (Exception err) {
            throw err;
        }
    }
    
    public ArrayList<Activity> getAll() throws Exception {
        String query = String.format(
            "SELECT * FROM %s",
            this.tableName
        );
        
        ArrayList<Activity> activities =  new ArrayList<Activity>();
        
        try {
            Statement statement = Database.ConfigDB().createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next()) {
                Activity activity = new Activity();
                int id = result.getInt("id");
                String description = result.getString("description");
                int typeId = result.getInt("type_id");
                float nominal = result.getFloat("nominal");
                int createdAt = result.getInt("created_at");
                int updatedAt = result.getInt("updated_at");
                
                activity
                    .setId(id)
                    .setDescription(description)
                    .setTypeId(typeId)
                    .setCreatedAt(createdAt)
                    .setUpdatedAt(updatedAt)
                    .setNominal(nominal);
                
                activities.add(activity);
            }
            
        } catch (Exception err) {
            throw err;
        }
        
        return activities;
    }
}
