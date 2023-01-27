class Player {
  String name;
  public void play() {
    System.out.println("He is an Indian");
	System.out.println("He is a Sportsplayer");
  }
  
}
class Cricketer extends Player {
	int bat_avg;
  public void info(){
	  System.out.println("His name  is " + name);
	  System.out.println("His average is :" + bat_avg);
	  if(bat_avg>45){
		  System.out.println("He is a good batsmen ");
	  }
	  else{
		  System.out.println("His batting average is not good");
	  }
}
}
class single_inheritance411932 {
  public static void main(String arg[]) {
    Cricketer c = new Cricketer();
    c.name = "RohitSharma";
	c.bat_avg=50;
    c.play();
    c.info();
   }
}
