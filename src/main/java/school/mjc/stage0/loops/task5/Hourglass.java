package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for(int i =1; i <=height; i ++){
            String sides = "";
            for(int a=1; a<=height; a++){
                if(i<=(height+1)/2) {
                    if (a < i || a > (height + 1) - i) {
                        sides += " ";
                    } else {
                        sides += 8;
                    }
                }else{
                    if (a > i || a < (height + 1) - i) {
                        sides += " ";
                    } else {
                        sides += 8;
                    }
                }
            }
            System.out.println(sides);
        }

    }
}
