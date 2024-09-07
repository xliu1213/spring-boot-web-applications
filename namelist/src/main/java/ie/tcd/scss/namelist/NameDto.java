package ie.tcd.scss.namelist;

public class NameDto {
  private String name;

  public NameDto(String name){
    this.name = name;
  }

  protected NameDto(){}

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
}
