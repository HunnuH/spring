package oop.constructor;
public class Movie {
  private String title;
  private String genre;
    
    public Movie(String title,String genre) {
    	this.title = title;
    	this.genre = genre;
    	System.out.println("��ȭ");
    }
    public void play() {
     	 System.out.println(this.title+"("+this.genre+") �����Դϴ�.");
    }  
}