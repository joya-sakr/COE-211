public class AdvancedWeek {
  
public AdvancedWeek(
    private  String day_1 = "Monday";
        private   String day_2 = "Tuesday";
          private  String day_3 = "Wednesday";
        private   String day_4 = "Thursday";
         private  String day_5 = "Friday";
         private  String day_6 = "Saturday";
         private  String day_7 = "Sunday";

     public int count = 1;
        private String day_1x = count + ": " + day_1 + ",";
       private String day_2x = ++count + ": " + day_2 + ",";
      private String day_3x = ++count + ": " + day_3 + ",";
      private String day_4x = ++count + ": " + day_4 + ",";
        private String day_5x = ++count + ": " + day_5 + ",";
      private   String day_6x = ++count + ": " + day_6 + ",";
       private  String day_7x = ++count + ": " + day_7;
          
    public void printDays() {
   System.out.println( day_1x +"\n" + day_2x +"\n"+ day_3x + "\n" + day_4x + "\n" + day_5x + "\n" + day_6x + "\n" + day_7x);
    }
}