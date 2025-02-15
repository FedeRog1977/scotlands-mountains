package com.example.springboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Hill")
public class Hill {
  @Id
  private String id;
  
  private String name;
  private String lat;
  private String lon;
  private String osGrid;
  private String elevation;
  private String prominence;
  private String isolation;
  private String summit;

  public Hill(
    String id,
    String name,
    String lat,
    String lon,
    String osGrid,
    String elevation,
    String prominence,
    String isolation,
    String summit
) {
    super();
    this.id = id;
    this.name = name;
    this.lat = lat;
    this.lon = lon;
    this.osGrid = osGrid;
    this.elevation = elevation;
    this.prominence = prominence;
    this.isolation = isolation;
    this.summit = summit;
  }
  
  public String getId() {
    return id;
  }
  
  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLat() {
    return lat;
  }

  public void setLat(String lat) {
    this.lat = lat;
  }

  public String getLon() {
    return lon;
  }

  public void setLon(String lon) {
    this.lon = lon;
  }

  public String getOsGrid() {
    return osGrid;
  }

  public void setOsGrid(String osGrid) {
    this.osGrid = osGrid;
  }

  public String getElevation() {
    return elevation;
  }

  public void setElevation(String elevation) {
    this.elevation = elevation;
  }

  public String getProminence() {
    return prominence;
  }

  public void setProminence(String prominence) {
    this.prominence = prominence;
  }

  public String getIsolation() {
    return isolation;
  }

  public void setIsolation(String isolation) {
    this.isolation = isolation;
  }

  public String getSummit() {
    return summit;
  }

  public void setSummit(String summit) {
    this.summit = summit;
  }
}