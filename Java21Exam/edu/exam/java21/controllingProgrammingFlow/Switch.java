package edu.exam.java21.controllingProgrammingFlow;

public class Switch {
    public static void main(String[] args) {
        System.out.println(switchReturn());
        System.out.println(switchYield(2));
        System.out.println(switchYield(3));
        System.out.println(switchYield(5));
    }

    public static String switchReturn(){
        var x = "a";
        switch (x) {
            case "a": return "first letter";
            default: return "not first letter";
        }
        // System.out.println("end"); unreachable
    }

    public static String switchYield(int plateNumber){
        var name = switch(plateNumber){
            // case 1 -> return "Mercury"; //not allowed
            case 1 -> "Mercury";
            case 2 -> {yield "Venus";}
            case 3 -> {
                var distanceFromSun = getDistance();
                if (distanceFromSun == 1) yield "earth";
                else yield "Mars";
            }
            case 5 -> throw new RuntimeException("Jupiter is very interesting!");
            default -> "Yet to find";
        };

        return name + " is your lucky planet";
    }
    private static int getDistance() {
        return 1;
    }
}
