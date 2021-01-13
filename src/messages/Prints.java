package messages;

public class Prints {

    private static Prints instance;


    public static Prints getInstance(){
        if (instance!=null){
            return instance;
        }
        return instance = new Prints();
    }



    //teacher prints

    public String getLessonsInfo(String name, int lessons,String discipline){
        return String.format("%s has %d lessons remaining for the semester in the discipline of %s.\n" +
                "==========================",name, lessons,discipline);
    }
    public String getInfoMessage(String fullname, int age,String country, String he,int daysOff,String his,
                          double salary){
        return String.format("%s is %d years old and is from %s.\n" +
                "%s has %d days off remaining from %s vacancy and %s gets %.2fBGN salary.\n" +
                "==========================\n",
                fullname,age,country,he,daysOff,his,he.toLowerCase(),salary);

    }
}
