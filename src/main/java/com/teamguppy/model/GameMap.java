package com.teamguppy.model;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class GameMap {

  @SerializedName("locations")
  @Expose
  private List<Room> locations = null;

  public List<Room> getLocations() {
    return locations;
  }

  public void setLocation(List<Room> locations) {
    this.locations = locations;
  }


  public void createLocation(){
    Gson gson = new Gson();
    BufferedReader br = null;
    GameMap location = new GameMap();

    try{
      br = new BufferedReader(new FileReader("src/main/resources/data/location.json"));
      location = gson.fromJson(br, GameMap.class);

      if (location != null) {
        for (Room loc : location.getLocations()){
        }
        System.out.println("game map created");
      }

    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } finally {
      if (br !=null) {
        try {
          br.close();

        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static void main(String[] args) {
    GameMap location = new GameMap();
    location.createLocation();
  }
}